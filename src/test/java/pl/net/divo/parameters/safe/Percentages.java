package pl.net.divo.parameters.safe;

import java.util.HashMap;
import java.util.Map;

public class Percentages {
    public static Map<String, Double> getPercentages1() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("PL1", 10.0);
        percentages.put("PL2", 10.0);
        percentages.put("FO1", 25.0);
        percentages.put("FO2", 25.0);
        percentages.put("FO3", 25.0);
        percentages.put("FI1",  5.0);

        return percentages;
    }

    public static Map<String, Double> getPercentages2() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("PL1", 10.0);
        percentages.put("PL2", 10.0);
        percentages.put("FO1", 15.0);
        percentages.put("FO2", 15.0);
        percentages.put("FO3", 15.0);
        percentages.put("FO4", 15.0);
        percentages.put("FO5", 15.0);
        percentages.put("FI1",  5.0);

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
