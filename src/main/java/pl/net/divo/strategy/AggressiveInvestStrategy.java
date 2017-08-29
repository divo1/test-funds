package pl.net.divo.strategy;

import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AggressiveInvestStrategy extends InvestStrategy {
    public AggressiveInvestStrategy(List<Fund> funds) {
        super(funds);
    }

    @Override
    public Map<Kind, Double> investStyle() {
        Map<Kind, Double> style = new HashMap<>();
        style.put(Kind.POLISH, 0.40);
        style.put(Kind.FOREIGN, 0.20);
        style.put(Kind.FINANCIAL, 0.40);

        return style;
    }
}
