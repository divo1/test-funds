package pl.net.divo.parameters.aggressive;

import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;

import java.util.LinkedList;
import java.util.List;

public class Funds {
    public static List<Fund> getFunds1() {
        List<Fund> funds = new LinkedList<>();

        funds.add(new Fund("PL1", "Fundusz Polski 1", Kind.POLISH));
        funds.add(new Fund("PL2", "Fundusz Polski 2", Kind.POLISH));
        funds.add(new Fund("PL3", "Fundusz Polski 3", Kind.POLISH));
        funds.add(new Fund("PL4", "Fundusz Polski 4", Kind.POLISH));

        funds.add(new Fund("FO1", "Fundusz Zagraniczny 1", Kind.FOREIGN));
        funds.add(new Fund("FO2", "Fundusz Zagraniczny 2", Kind.FOREIGN));

        funds.add(new Fund("FI1", "Fundusz Pieniężny 1", Kind.FINANCIAL));
        funds.add(new Fund("FI2", "Fundusz Pieniężny 2", Kind.FINANCIAL));

        return funds;
    }

    public static List<Fund> getFunds2() {
        List<Fund> funds = new LinkedList<>();

        funds.add(new Fund("PL1", "Fundusz Polski 1", Kind.POLISH));
        funds.add(new Fund("PL2", "Fundusz Polski 2", Kind.POLISH));

        funds.add(new Fund("FO1", "Fundusz Zagraniczny 1", Kind.FOREIGN));
        funds.add(new Fund("FO2", "Fundusz Zagraniczny 2", Kind.FOREIGN));

        funds.add(new Fund("FI1", "Fundusz Pieniężny 1", Kind.FINANCIAL));

        return funds;
    }
}
