package pl.net.divo.parameters.balanced;

import java.util.HashMap;
import java.util.Map;

public class Percentages {
    public static Map<String, Double> getPercentages1() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("PL1", 10.0);
        percentages.put("PL2", 10.0);
        percentages.put("PL3", 10.0);
        percentages.put("FO1", 10.0);
        percentages.put("FO2", 10.0);
        percentages.put("FO3", 10.0);
        percentages.put("FO4", 10.0);
        percentages.put("FO5", 10.0);
        percentages.put("FO6", 10.0);
        percentages.put("FI1", 10.0);

        return percentages;
    }

    public static Map<String, Double> getPercentages2() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("PL1", 10.0);
        percentages.put("PL2", 10.0);
        percentages.put("PL3", 10.0);
        percentages.put("FO1", 20.0);
        percentages.put("FO2", 20.0);
        percentages.put("FO3", 20.0);
        percentages.put("FI1",  5.0);
        percentages.put("FI2",  5.0);

        return percentages;
    }
}
