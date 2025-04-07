import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DefaultNickelMetallurgyTest {
    @Test
    public void testSmelt() {
        Metallurgy m = new DefaultNickelMetallurgy();
        assertEquals("Metal Nickel", m.smelt());
    }
}
