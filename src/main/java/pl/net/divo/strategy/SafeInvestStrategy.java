package pl.net.divo.strategy;

import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SafeInvestStrategy extends InvestStrategy {
    public SafeInvestStrategy(List<Fund> funds) {
        super(funds);
    }

    @Override
    public Map<Kind, Double> investStyle() {
        Map<Kind, Double> style = new HashMap<>();
        style.put(Kind.POLISH, 0.20);
        style.put(Kind.FOREIGN, 0.75);
        style.put(Kind.FINANCIAL, 0.05);

        return style;
    }
}
