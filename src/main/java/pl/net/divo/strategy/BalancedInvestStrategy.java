package pl.net.divo.strategy;

import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;

import java.math.BigDecimal;
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
        style.put(Kind.POLISH, 30.0);
        style.put(Kind.FOREIGN, 60.0);
        style.put(Kind.FINANCIAL, 10.0);

        return style;
    }
}
