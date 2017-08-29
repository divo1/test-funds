package pl.net.divo.parameters.safe;

import pl.net.divo.funds.Fund;
import pl.net.divo.funds.Kind;

import java.util.LinkedList;
import java.util.List;

public class Funds {
    public static List<Fund> getFunds1() {
        List<Fund> funds = new LinkedList<>();

        funds.add(new Fund("1", "Fundusz Polski 1", Kind.POLISH));
        funds.add(new Fund("2", "Fundusz Polski 2", Kind.POLISH));

        funds.add(new Fund("3", "Fundusz Zagraniczny 1", Kind.FOREIGN));
        funds.add(new Fund("4", "Fundusz Zagraniczny 2", Kind.FOREIGN));
        funds.add(new Fund("5", "Fundusz Zagraniczny 3", Kind.FOREIGN));

        funds.add(new Fund("6", "Fundusz Pieniężny 1", Kind.FINANCIAL));

        return funds;
    }

    public static List<Fund> getFunds2() {
        List<Fund> funds = new LinkedList<>();

        funds.add(new Fund("1", "Fundusz Polski 1", Kind.POLISH));
        funds.add(new Fund("2", "Fundusz Polski 2", Kind.POLISH));

        funds.add(new Fund("3", "Fundusz Zagraniczny 1", Kind.FOREIGN));
        funds.add(new Fund("4", "Fundusz Zagraniczny 2", Kind.FOREIGN));
        funds.add(new Fund("5", "Fundusz Zagraniczny 3", Kind.FOREIGN));
        funds.add(new Fund("6", "Fundusz Zagraniczny 3", Kind.FOREIGN));
        funds.add(new Fund("7", "Fundusz Zagraniczny 3", Kind.FOREIGN));

        funds.add(new Fund("8", "Fundusz Pieniężny 1", Kind.FINANCIAL));

        return funds;
    }
}
