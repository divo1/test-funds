package pl.net.divo.strategy;

import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BalancedInvestStrategy extends InvestStrategy {
    public BalancedInvestStrategy(List<Fund> funds) {
        super(funds);
    }

    @Override
    public Map<Kind, Double> investStyle() {
        Map<Kind, Double> style = new HashMap<>();
        style.put(Kind.POLISH, 0.30);
        style.put(Kind.FOREIGN, 0.60);
        style.put(Kind.FINANCIAL, 0.10);

        return style;
    }
}
