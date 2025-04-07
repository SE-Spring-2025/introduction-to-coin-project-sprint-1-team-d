import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DefaultHalfDollarMetallurgyTest {
    @Test
    public void testSmelt() {
        Metallurgy m = new DefaultHalfDollarMetallurgy();
        assertEquals("Metal Half Dollar", m.smelt());
    }
}

