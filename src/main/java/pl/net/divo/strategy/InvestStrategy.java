package pl.net.divo.strategy;

import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class InvestStrategy {
    private List<Fund> funds;

    InvestStrategy(List<Fund> funds) {
        this.funds = funds;
    }

    public Map<Fund, Double> getPercentages() {
        Map<Kind, Double> style = investStyle();
        Map<Kind, Long> counted = funds.stream().collect(Collectors.groupingBy(Fund::getKind, Collectors.counting()));

        Map<Fund, Double> percentages = funds.stream().collect(Collectors.toMap(Function.identity(), (f) -> {
            if (!style.containsKey(f.getKind()) || !counted.containsKey(f.getKind())) {
                return 0.0;
            }

            return Math.floor(style.get(f.getKind()) / counted.get(f.getKind()) * 100) / 100.0;
        }));

        Double percentFloor = percentages.entrySet().stream().mapToDouble(f -> f.getValue()).sum();

        if (percentFloor.compareTo(100.0) < 0) {
            Map.Entry<Fund, Double> entry = percentages.entrySet().iterator().next();
            Double d = entry.getValue();
            Integer i = new Double(d * 100).intValue() + 10000 - new Double(percentFloor * 100).intValue();
            entry.setValue(i / 100.0);
        }

        return percentages;
    }

    public abstract Map<Kind, Double> investStyle();
}
