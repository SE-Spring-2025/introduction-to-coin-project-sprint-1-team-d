import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HalfDollarTest {
    @Test
    public void testConstructor() {
        int year = 2023;
        HalfDollar coin = new HalfDollar(year);

        assertEquals("Half Dollar", coin.getFamiliarName());
        assertEquals(0.50, coin.getValue(), 0.0001);
        assertEquals("KennedyFront.png", coin.getFrontImage());
        assertEquals("Metal Half Dollar", coin.getMetallurgy());
        assertTrue(coin.getRidgedEdge());
        assertEquals(year, coin.getYear());
    }
}
