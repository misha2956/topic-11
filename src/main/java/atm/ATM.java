package atm;

public class ATM {
    private final DefaultTray firstTray;

    public ATM(DefaultTrayType ...defaultTrayTypes) {
        firstTray = defaultTrayTypes[0].getDefaultTray();
        for (int i = 0; i < defaultTrayTypes.length - 1; i++) {
            defaultTrayTypes[i].getDefaultTray().setNext(
                    defaultTrayTypes[i + 1].getDefaultTray()
            );
        }
    }

    public void process(int amount) throws IllegalArgumentException {
        firstTray.process(amount);
    }
}
