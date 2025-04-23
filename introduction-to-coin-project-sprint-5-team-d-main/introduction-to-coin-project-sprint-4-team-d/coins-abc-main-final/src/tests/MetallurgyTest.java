import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MetallurgyTest {
    
    @Test
    public void testCopperMetallurgy() {
        Metallurgy copper = new CopperMetallurgy();
        assertEquals("Copper", copper.smelt());
    }
    
    @Test
    public void testCuproNickelMetallurgy() {
        Metallurgy cuproNickel = new CuproNickelMetallurgy();
        assertEquals("Cupro-Nickel", cuproNickel.smelt());
    }
} 