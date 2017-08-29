package pl.net.divo.parameters.balanced;

import java.util.HashMap;
import java.util.Map;

public class Percentages {
    public static Map<String, Double> getPercentages1() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("PL1", 0.10);
        percentages.put("PL2", 0.10);
        percentages.put("PL3", 0.10);
        percentages.put("FO1", 0.10);
        percentages.put("FO1", 0.10);
        percentages.put("FO2", 0.10);
        percentages.put("FO2", 0.10);
        percentages.put("FO2", 0.10);
        percentages.put("FO2", 0.10);
        percentages.put("FI1", 0.10);

        return percentages;
    }

    public static Map<String, Double> getPercentages2() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("PL1", 0.10);
        percentages.put("PL2", 0.10);
        percentages.put("PL3", 0.10);
        percentages.put("FO1", 0.20);
        percentages.put("FO2", 0.20);
        percentages.put("FO3", 0.20);
        percentages.put("FI1", 0.05);
        percentages.put("FI2", 0.05);

        return percentages;
    }
}
