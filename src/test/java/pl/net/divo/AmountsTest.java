package pl.net.divo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.net.divo.amount.Calculate;
import pl.net.divo.funds.Fund;
import pl.net.divo.parameters.safe.Amounts;
import pl.net.divo.parameters.safe.Funds;
import pl.net.divo.strategy.InvestStrategy;
import pl.net.divo.strategy.SafeInvestStrategy;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(Parameterized.class)
public class AmountsTest {
    private BigDecimal totalAmount = new BigDecimal(10000);
    private Map<Fund, BigDecimal> amounts;

    private List<Fund> funds = new LinkedList<>();
    private Map<String, BigDecimal> expectedAmounts = new HashMap<>();

    public AmountsTest(List<Fund> funds, Map<String, BigDecimal> expectedAmounts) {
        this.funds = funds;
        this.expectedAmounts = expectedAmounts;
    }

    @Parameterized.Parameters(name="Checking: {index}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { Funds.getFunds1(), Amounts.getAmounts1() },
                { Funds.getFunds3(), Amounts.getAmounts2() },
        });
    }

    @Before
    public void prepareAmounts() {
        InvestStrategy strategy = new SafeInvestStrategy(funds);
        Calculate calculateAmount = new Calculate(strategy.getPercentages());
        amounts = calculateAmount.getAmount(totalAmount);
    }

    @Test
    public void testAllKeysAreNotNull() {
        assertNotNull(amounts);
    }

    @Test
    public void testAllKeysExists() {
        assertEquals(amounts.size(), expectedAmounts.size());
    }

    @Test
    public void testSafeInvest() {
        assertEquals(totalAmount, amounts.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add));
    }
}
