package pl.net.divo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.net.divo.context.FundsContext;
import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;
import pl.net.divo.strategy.InvestStrategy;
import pl.net.divo.strategy.SafeInvestStrategy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SafeInvestStrategyTest {
    private FundsContext context;
    private long amountOfInvest = 10000;
    private InvestStrategy strategy;

    private static List<Fund> funds = new LinkedList<>();
    private static Map<String, Double> acceptedPercentages = new HashMap<>();

    @BeforeClass
    public static void prepareFunds() {
        funds.add(new Fund("1", "Fundusz Polski 1", Kind.POLISH));
        funds.add(new Fund("2", "Fundusz Polski 2", Kind.POLISH));

        funds.add(new Fund("3", "Fundusz Zagraniczny 1", Kind.FOREIGN));
        funds.add(new Fund("4", "Fundusz Zagraniczny 2", Kind.FOREIGN));
        funds.add(new Fund("5", "Fundusz Zagraniczny 3", Kind.FOREIGN));

        funds.add(new Fund("6", "Fundusz Pieniężny 1", Kind.FINANCIAL));
    }

    @BeforeClass
    public static void prepareAcceptedPercentages() {
        acceptedPercentages.put("1", 0.10);
        acceptedPercentages.put("1", 0.10);
        acceptedPercentages.put("1", 0.25);
        acceptedPercentages.put("1", 0.25);
        acceptedPercentages.put("1", 0.25);
        acceptedPercentages.put("1", 0.05);
    }

    @Before
    public void prepareContext() {
        context = new FundsContext();
    }

    @Before
    public void prepareStrategy() {
        strategy = new SafeInvestStrategy(funds);
    }

    @Test
    public void testAllKeysExists() {
        context.setInvestStrategy(strategy);
        Map<Fund, Double> percentages = context.percentages(amountOfInvest);

        assertNotNull(percentages);
        assertEquals(percentages.size(), acceptedPercentages.size());
    }

    @Test
    public void testSafeInvest() {
        context.setInvestStrategy(strategy);
        Map<Fund, Double> percentages = context.percentages(amountOfInvest);

        assertEquals(percentages, acceptedPercentages);
    }
}
