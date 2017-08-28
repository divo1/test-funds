package pl.net.divo.strategy;

import pl.net.divo.funds.Fund;

import java.util.List;
import java.util.Map;

public abstract class InvestStrategy {
    private List<Fund> funds;

    public InvestStrategy(List<Fund> funds) {
        this.funds = funds;
    }

    public abstract Map<Fund, Double> getPercentages(long investAmount);
}
