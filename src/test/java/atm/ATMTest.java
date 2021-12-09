package atm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private ATM atm;

    @BeforeEach
    void setUp() {
        atm = new ATM(DefaultTrayType.TWENTY, DefaultTrayType.TEN, DefaultTrayType.FIVE);
    }

    @Test
    void process() {
        assertThrows(IllegalArgumentException.class, () -> atm.process(1));
        assertDoesNotThrow(() -> atm.process(5));
        assertDoesNotThrow(() -> atm.process(4000));
        assertDoesNotThrow(() -> atm.process(2000));
        assertDoesNotThrow(() -> atm.process(995));
        assertThrows(IllegalArgumentException.class, () -> atm.process(5));
    }
}