package pl.net.divo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.net.divo.context.PercentageContext;
import pl.net.divo.funds.Fund;
import pl.net.divo.parameters.safe.Funds;
import pl.net.divo.parameters.safe.Percentages;
import pl.net.divo.strategy.InvestStrategy;
import pl.net.divo.strategy.SafeInvestStrategy;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(Parameterized.class)
public class PercentageContextTest {
    private PercentageContext ctx = new PercentageContext();

    private List<Fund> funds = new LinkedList<>();

    public PercentageContextTest(List<Fund> funds) {
        this.funds = funds;
    }

    @Parameterized.Parameters(name="Checking: {index}")
    public static Collection<Object> data() {
        return Arrays.asList(new Object[] {
                Funds.getFunds3()
        });
    }

    @Before
    public void prepareStrategy() {
        ctx.setInvestStrategy(new SafeInvestStrategy(funds));
    }

    @Test
    public void testPercentage100() {
        Map<Fund, Double> percentages = ctx.percentages();
        assertEquals(100, percentages.entrySet().stream().mapToDouble(f -> f.getValue()).sum(), 0.009);
    }
}
