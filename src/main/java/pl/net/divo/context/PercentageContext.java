package pl.net.divo.context;

import pl.net.divo.funds.Fund;
import pl.net.divo.strategy.InvestStrategy;

import java.util.Map;

public class PercentageContext {
    private InvestStrategy strategy;

    public void setInvestStrategy(InvestStrategy strategy) {
        this.strategy = strategy;
    }

    public Map<Fund, Double> percentages() {
        return strategy.getPercentages();
    }
}
