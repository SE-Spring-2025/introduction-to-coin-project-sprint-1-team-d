import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test class for the Metallurgy implementations.
 */
public class MetallurgyTest {

    @Test
    public void testCopperMetallurgy() {
        Metallurgy metallurgy = new CopperMetallurgy();
        assertEquals("Copper", metallurgy.smelt());
    }

    @Test
    public void testCuproNickelMetallurgy() {
        Metallurgy metallurgy = new CuproNickelMetallurgy();
        assertEquals("Cupro-Nickel", metallurgy.smelt());
    }
} 