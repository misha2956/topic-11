package atm;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DefaultTrayTest {
    private DefaultTray defaultTray;

    @BeforeEach
    void setUp() {
        defaultTray = DefaultTrayType.TEN.getDefaultTray();
    }

    @Test
    void process() {
        assertDoesNotThrow(() -> defaultTray.process(1100));
        assertThrows(IllegalArgumentException.class, () -> defaultTray.process(1100));
    }
}