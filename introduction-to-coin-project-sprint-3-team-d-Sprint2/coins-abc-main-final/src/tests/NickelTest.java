import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NickelTest {
    @Test
    public void testConstructor() {
        int year = 2023;
        Nickel coin = new Nickel(year);

        assertEquals("Nickel", coin.getFamiliarName());
        assertEquals(0.05, coin.getValue(), 0.0001);
        assertEquals("JeffersonFront.png", coin.getFrontImage());
        assertEquals("Metal Nickel", coin.getMetallurgy());
        assertFalse(coin.getRidgedEdge());
        assertEquals(year, coin.getYear());
    }
}

