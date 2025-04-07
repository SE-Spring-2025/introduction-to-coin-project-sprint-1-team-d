import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    public void testConstructor() {
        int year = 2023;
        Dollar coin = new Dollar(year);

        assertEquals("Dollar", coin.getFamiliarName());
        assertEquals(1.00, coin.getValue(), 0.0001);
        assertEquals("SacagaweaFront.png", coin.getFrontImage());
        assertEquals("Metal Dollar", coin.getMetallurgy());
        assertTrue(coin.getRidgedEdge());
        assertEquals(year, coin.getYear());
    }
}

