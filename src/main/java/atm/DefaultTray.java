package atm;

import lombok.Setter;

public class DefaultTray implements Tray {
    private final int banknoteValue;
    private int banknotesLeft = 200;
    private @Setter Tray next;

    public DefaultTray(int banknoteValue) {
        this.banknoteValue = banknoteValue;
    }

    @Override
    public void process(int amount) throws IllegalArgumentException {
        if (amount == 0) {
            return;
        }
        int deltaBanknotes = amount / banknoteValue;
        if (banknotesLeft < deltaBanknotes) {
            if (next == null) {
                throw new IllegalArgumentException("Not enough banknotes!");
            }
            next.process(amount);
        } else {
            int remainder = amount % banknoteValue;
            if (remainder != 0) {
                if (next == null) {
                    throw new IllegalArgumentException("Impossible amount!");
                }
                next.process(remainder);
            }
            System.out.format("Tray with banknotes of value %d: giving %d banknotes...\n", banknoteValue, deltaBanknotes);
            banknotesLeft -= deltaBanknotes;
        }
    }
}
