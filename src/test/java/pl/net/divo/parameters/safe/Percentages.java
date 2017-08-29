package pl.net.divo.parameters.safe;

import java.util.HashMap;
import java.util.Map;

public class Percentages {
    public static Map<String, Double> getPercentages1() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("1", 0.10);
        percentages.put("2", 0.10);
        percentages.put("3", 0.25);
        percentages.put("4", 0.25);
        percentages.put("5", 0.25);
        percentages.put("6", 0.05);

        return percentages;
    }

    public static Map<String, Double> getPercentages2() {
        Map<String, Double> percentages = new HashMap<>();
        percentages.put("1", 0.10);
        percentages.put("2", 0.10);
        percentages.put("3", 0.15);
        percentages.put("4", 0.15);
        percentages.put("5", 0.15);
        percentages.put("6", 0.15);
        percentages.put("7", 0.15);
        percentages.put("8", 0.05);

        return percentages;
    }
}
