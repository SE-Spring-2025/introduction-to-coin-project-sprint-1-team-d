import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NickelTest {
    @Test
    public void testConstructor() {
        int year = 2025;
        Nickel coin = new Nickel(year);

        assertEquals("Nickel", coin.getFamiliarName());
        assertEquals(0.05, coin.getValue(), 0.0001);
        assertEquals("T_Jefferson", coin.getFrontImage());
        assertEquals("Cupro-Nickel", coin.getMetallurgy());
        assertFalse(coin.getRidgedEdge());
        assertEquals(year, coin.getYear());
    }
    
    @Test
    public void testMetallurgyChange() {
        Nickel coin = new Nickel(2025);
        assertEquals("Cupro-Nickel", coin.getMetallurgy());
        
        // Change to copper
        coin.setMetallurgyStrategy(new CopperMetallurgy());
        assertEquals("Copper", coin.getMetallurgy());
        
        // Change back to cupro-nickel
        coin.setMetallurgyStrategy(new CuproNickelMetallurgy());
        assertEquals("Cupro-Nickel", coin.getMetallurgy());
    }
}

