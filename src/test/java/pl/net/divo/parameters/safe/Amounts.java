package pl.net.divo.parameters.safe;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Amounts {
    public static Map<String, BigDecimal> getAmounts1() {
        Map<String, BigDecimal> percentages = new HashMap<>();
        percentages.put("PL1", new BigDecimal(1000.0));
        percentages.put("PL2", new BigDecimal(1000.0));
        percentages.put("FO1", new BigDecimal(2500.0));
        percentages.put("FO2", new BigDecimal(2500.0));
        percentages.put("FO3", new BigDecimal(2500.0));
        percentages.put("FI1", new BigDecimal( 500.0));

        return percentages;
    }
    public static Map<String, BigDecimal> getAmounts2() {
        Map<String, BigDecimal> percentages = new HashMap<>();
        percentages.put("PL1", new BigDecimal(668.0));
        percentages.put("PL2", new BigDecimal(666.0));
        percentages.put("PL3", new BigDecimal(666.0));
        percentages.put("FO1", new BigDecimal(3750.0));
        percentages.put("FO2", new BigDecimal(3750.0));
        percentages.put("FI1", new BigDecimal( 500.0));

        return percentages;
    }
}
