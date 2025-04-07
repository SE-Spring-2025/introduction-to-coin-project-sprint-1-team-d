import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DimeTest {
    @Test
    public void testConstructor() {
        int year = 2023;
        Dime coin = new Dime(year);

        assertEquals("Dime", coin.getFamiliarName());
        assertEquals(0.10, coin.getValue(), 0.0001);
        assertEquals("RooseveltFront.png", coin.getFrontImage());
        assertEquals("Metal Dime", coin.getMetallurgy());
        assertTrue(coin.getRidgedEdge());
        assertEquals(year, coin.getYear());
    }
}
