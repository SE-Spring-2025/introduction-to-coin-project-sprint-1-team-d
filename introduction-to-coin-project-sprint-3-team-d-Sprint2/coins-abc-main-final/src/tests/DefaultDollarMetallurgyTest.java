import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DefaultDollarMetallurgyTest {
    @Test
    public void testSmelt() {
        Metallurgy m = new DefaultDollarMetallurgy();
        assertEquals("Metal Dollar", m.smelt());
    }
}

