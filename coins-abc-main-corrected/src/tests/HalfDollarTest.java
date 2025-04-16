import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HalfDollarTest {
    @Test
    public void testConstructor() {
        int year = 2025;
        HalfDollar coin = new HalfDollar(year);

        assertEquals("HalfDollar", coin.getFamiliarName());
        assertEquals(0.50, coin.getValue(), 0.0001);
        assertEquals("J_Kennedy", coin.getFrontImage());
        assertEquals("Cupro-Nickel", coin.getMetallurgy());
        assertTrue(coin.getRidgedEdge());
        assertEquals(year, coin.getYear());
    }
}
