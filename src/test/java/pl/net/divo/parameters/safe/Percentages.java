package pl.net.divo.parameters.safe;

import java.util.HashMap;
import java.util.Map;

public class Percentages {
    public static Map<String, Double> getPercentages1() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("1", 10.0);
        percentages.put("2", 10.0);
        percentages.put("3", 25.0);
        percentages.put("4", 25.0);
        percentages.put("5", 25.0);
        percentages.put("6",  5.0);

        return percentages;
    }

    public static Map<String, Double> getPercentages2() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("1", 10.0);
        percentages.put("2", 10.0);
        percentages.put("3", 15.0);
        percentages.put("4", 15.0);
        percentages.put("5", 15.0);
        percentages.put("6", 15.0);
        percentages.put("7", 15.0);
        percentages.put("8",  5.0);

        return percentages;
    }

    public static Map<String, Double> getPercentages3() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("PL1", 6.68);
        percentages.put("PL2", 6.66);
        percentages.put("PL3", 6.66);
        percentages.put("FO1", 37.5);
        percentages.put("FO2", 37.5);
        percentages.put("FI1", 5.0);

        return percentages;
    }
}
