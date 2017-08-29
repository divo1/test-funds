package pl.net.divo.parameters.aggressive;

import java.util.HashMap;
import java.util.Map;

public class Percentages {
    public static Map<String, Double> getPercentages1() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("PL1", 10.0);
        percentages.put("PL2", 10.0);
        percentages.put("PL3", 10.0);
        percentages.put("PL4", 10.0);
        percentages.put("FO1", 10.0);
        percentages.put("FO2", 10.0);
        percentages.put("FI1", 20.0);
        percentages.put("FI2", 20.0);

        return percentages;
    }

    public static Map<String, Double> getPercentages2() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("PL1", 20.0);
        percentages.put("PL2", 20.0);
        percentages.put("FO1", 10.0);
        percentages.put("FO2", 10.0);
        percentages.put("FI1", 40.0);

        return percentages;
    }
}
