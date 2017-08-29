package pl.net.divo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;
import pl.net.divo.strategy.InvestStrategy;
import pl.net.divo.strategy.SafeInvestStrategy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class SafeInvestStrategyTest {
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
        acceptedPercentages.put("2", 0.10);
        acceptedPercentages.put("3", 0.25);
        acceptedPercentages.put("4", 0.25);
        acceptedPercentages.put("5", 0.25);
        acceptedPercentages.put("6", 0.05);
    }

    @Before
    public void prepareStrategy() {
        strategy = new SafeInvestStrategy(funds);
    }

    @Test
    public void testAllKeysExists() {
        Map<Fund, Double> percentages = strategy.getPercentages();

        assertNotNull(percentages);
        assertEquals(percentages.size(), acceptedPercentages.size());
    }

    @Test
    public void testSafeInvest() {
        Map<Fund, Double> percentages = strategy.getPercentages();
        Map<String, Double> parsedPercentage = percentages.entrySet().stream().collect(Collectors.toMap(e -> e.getKey().getID(), Map.Entry::getValue));
        assertEquals(parsedPercentage, acceptedPercentages);
    }
}
