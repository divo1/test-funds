package pl.net.divo.funds;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@Getter
@EqualsAndHashCode(of = "ID")
public class Fund {
    @NonNull
    private String ID;

    @NonNull
    private String name;

    @NonNull
    private Kind kind;

    public Fund(String ID, String name, Kind kind) {
        this.ID = ID;
        this.name = name;
        this.kind = kind;
    }
}
