package pl.net.divo;

import lombok.extern.java.Log;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.net.divo.amount.Calculate;
import pl.net.divo.funds.Fund;
import pl.net.divo.parameters.safe.Funds;
import pl.net.divo.strategy.InvestStrategy;
import pl.net.divo.strategy.SafeInvestStrategy;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.Assert.assertEquals;

@Log
public class NotUsedAmountTest {
    private BigDecimal totalAmount = new BigDecimal(10001);
    private BigDecimal notUsedAmount;

    private List<Fund> funds = new LinkedList<>();
    private BigDecimal expectedNotUsedAmount;

    public NotUsedAmountTest() {
        this.funds = Funds.getFunds1();
        this.expectedNotUsedAmount = new BigDecimal(1);
    }

    @Before
    public void prepareAmounts() {
        InvestStrategy strategy = new SafeInvestStrategy(funds);
        Calculate calculateAmount = new Calculate(strategy.getPercentages());
        notUsedAmount = calculateAmount.getNotUsedAmount(totalAmount);
    }

    @Test
    public void isNotUsedAmountEqualExpected() {
        assertEquals(expectedNotUsedAmount, notUsedAmount);
    }
}
