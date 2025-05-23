import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    Calculatrice calculatrice;

    @Test
    @DisplayName("1 + 1 = 2")
    void addTest() {
        assertEquals(2, calculatrice.add(1, 1), "1 + 1 = 2");
    }

    @Test
    @DisplayName("1 / 2 = 0.5")
    void divTest() {
        assertEquals(0.5, calculatrice.div(1, 2), "1 / 2 = 0.5");
    }

    @Test
    @DisplayName("2 * 2 = 4")
    void multTest() {
        assertEquals(4, calculatrice.mult(2, 2), "2 * 2 = 4");
    }

    @Test
    @DisplayName("2 - 1 = 1")
    void minusTest() {
        assertEquals(1, calculatrice.minus(2, 1), "2 - 1 = 1");
    }
}
