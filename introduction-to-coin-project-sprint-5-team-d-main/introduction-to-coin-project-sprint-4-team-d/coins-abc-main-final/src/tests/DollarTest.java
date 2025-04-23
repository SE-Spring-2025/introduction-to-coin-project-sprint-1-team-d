import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    public void testConstructor() {
        int year = 2025;
        Dollar coin = new Dollar(year);

        assertEquals("Dollar", coin.getFamiliarName());
        assertEquals(1.00, coin.getValue(), 0.0001);
        assertEquals("S_Anthony", coin.getFrontImage());
        assertEquals("Cupro-Nickel", coin.getMetallurgy());
        assertTrue(coin.getRidgedEdge());
        assertEquals(year, coin.getYear());
    }
    
    @Test
    public void testMetallurgyChange() {
        Dollar coin = new Dollar(2025);
        assertEquals("Cupro-Nickel", coin.getMetallurgy());
        
        // Change to copper
        coin.setMetallurgyStrategy(new CopperMetallurgy());
        assertEquals("Copper", coin.getMetallurgy());
        
        // Change back to cupro-nickel
        coin.setMetallurgyStrategy(new CuproNickelMetallurgy());
        assertEquals("Cupro-Nickel", coin.getMetallurgy());
    }
}

