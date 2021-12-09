package atm;

import lombok.Getter;

public enum DefaultTrayType {
    FIVE(5),
    TEN(10),
    TWENTY(20);

    private final @Getter DefaultTray defaultTray;

    DefaultTrayType(int banknoteValue) {
        this.defaultTray = new DefaultTray(banknoteValue);
    }
}
