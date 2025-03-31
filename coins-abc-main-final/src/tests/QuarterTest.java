import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuarterTest {
    @Test
    public void testConstructor() {
        int year = 2025;
        Quarter coin = new Quarter(year);

        assertEquals("Quarter", coin.getFamiliarName());
        assertEquals(0.25, coin.getValue(), 0.0001);
        assertEquals("G_Washington", coin.getFrontImage());
        assertEquals("Cupro-Nickel", coin.getMetallurgy());
        assertTrue(coin.getRidgedEdge());
        assertEquals(year, coin.getYear());
    }
}
