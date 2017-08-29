package pl.net.divo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.net.divo.funds.Fund;
import pl.net.divo.parameters.safe.Funds;
import pl.net.divo.parameters.safe.Percentages;
import pl.net.divo.strategy.InvestStrategy;
import pl.net.divo.strategy.SafeInvestStrategy;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(Parameterized.class)
public class SafeInvestStrategyTest {
    private InvestStrategy strategy;

    private List<Fund> funds = new LinkedList<>();
    private Map<String, Double> acceptedPercentages = new HashMap<>();

    public SafeInvestStrategyTest(List<Fund> funds, Map<String, Double> acceptedPercentages) {
        this.funds = funds;
        this.acceptedPercentages = acceptedPercentages;
    }

    @Parameterized.Parameters(name="Checking: {index}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { Funds.getFunds1(), Percentages.getPercentages1() },
                { Funds.getFunds2(), Percentages.getPercentages2() },
        });
    }

    @Before
    public void prepareStrategy() {
        strategy = new SafeInvestStrategy(funds);
    }

    @Test
    public void testAllKeysAreNotNull() {
        Map<Fund, Double> percentages = strategy.getPercentages();
        assertNotNull(percentages);
    }

    @Test
    public void testAllKeysExists() {
        Map<Fund, Double> percentages = strategy.getPercentages();
        assertEquals(percentages.size(), acceptedPercentages.size());
    }

    @Test
    public void testSafeInvest() {
        Map<Fund, Double> percentages = strategy.getPercentages();
        Map<String, Double> parsedPercentage = percentages.entrySet().stream().collect(Collectors.toMap(e -> e.getKey().getID(), Map.Entry::getValue));
        assertEquals(acceptedPercentages, parsedPercentage);
    }
}
