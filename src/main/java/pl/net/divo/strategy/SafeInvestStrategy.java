package pl.net.divo.strategy;

import pl.net.divo.funds.Fund;

import java.util.List;
import java.util.Map;


public class SafeInvestStrategy extends InvestStrategy {
    public SafeInvestStrategy(List<Fund> funds) {
        super(funds);
    }

    @Override
    public Map<Fund, Double> getPercentages(long investAmount) {
        return null;
    }
}
