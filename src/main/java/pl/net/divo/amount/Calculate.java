package pl.net.divo.amount;

import pl.net.divo.funds.Fund;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculate {
    private Map<Fund, Double> percentages;

    public Calculate(Map<Fund, Double> percentages) {
        this.percentages = percentages;
    }

    public Map<Fund, BigDecimal> getAmount(BigDecimal totalAmount) {
        return percentages.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> {
            return totalAmount.divide(new BigDecimal(100)).multiply(new BigDecimal(e.getValue().doubleValue())).multiply(new BigDecimal(1000));
        }));
    }
}
