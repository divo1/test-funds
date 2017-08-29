package pl.net.divo.strategy;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class InvestStrategy {
    private List<Fund> funds;
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(InvestStrategy.class.getName());

    public InvestStrategy(List<Fund> funds) {
        this.funds = funds;
    }

    public Map<Fund, Double> getPercentages() {
        Map<Kind, Double> style = investStyle();
        Map<Kind, Long> counted = funds.stream().collect(Collectors.groupingBy(Fund::getKind, Collectors.counting()));

        return funds.stream().collect(Collectors.toMap(Function.identity(), (f) -> {
            if (!style.containsKey(f.getKind()) || !counted.containsKey(f.getKind())) {
                return 0.0;
            }
            return style.get(f.getKind()) / counted.get(f.getKind());
        }));

    }
    public abstract Map<Kind, Double> investStyle();
}
