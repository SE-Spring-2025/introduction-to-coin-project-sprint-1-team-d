import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PennyTest {
    @Test
    public void testConstructor() {
        int year = 2025;
        Penny coin = new Penny(year);

        assertEquals("Penny", coin.getFamiliarName());
        assertEquals(0.01, coin.getValue(), 0.0001);
        assertEquals("A_Lincoln", coin.getFrontImage());
        assertEquals("Copper", coin.getMetallurgy());
        assertFalse(coin.getRidgedEdge());
        assertEquals(year, coin.getYear());
    }
    
    @Test
    public void testMetallurgyChange() {
        Penny coin = new Penny(2025);
        assertEquals("Copper", coin.getMetallurgy());
        
        // Change to cupro-nickel
        coin.setMetallurgyStrategy(new CuproNickelMetallurgy());
        assertEquals("Cupro-Nickel", coin.getMetallurgy());
        
        // Change back to copper
        coin.setMetallurgyStrategy(new CopperMetallurgy());
        assertEquals("Copper", coin.getMetallurgy());
    }
}
