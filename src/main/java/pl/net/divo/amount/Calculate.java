package pl.net.divo.amount;

import lombok.extern.java.Log;
import pl.net.divo.funds.Fund;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Map;
import java.util.stream.Collectors;

@Log
public class Calculate {
    private Map<Fund, Double> percentages;

    public Calculate(Map<Fund, Double> percentages) {
        this.percentages = percentages;
    }

    public Map<Fund, BigDecimal> getAmount(BigDecimal totalAmount) {
        return percentages.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> {
            Double percent = e.getValue() * 100;
            BigDecimal amount = totalAmount.multiply(new BigDecimal(percent)).divide(new BigDecimal(10000));
            return new BigDecimal(amount.toBigInteger());
        }));
    }

    public BigDecimal getNotUsedAmount(BigDecimal totalAmount) {
        Map<Fund, BigDecimal> amount = getAmount(totalAmount);
        BigDecimal percentFloor = amount.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        return totalAmount.subtract(percentFloor);
    }
}
