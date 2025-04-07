import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DefaultQuarterMetallurgyTest {
    @Test
    public void testSmelt() {
        Metallurgy m = new DefaultQuarterMetallurgy();
        assertEquals("Metal Quarter", m.smelt());
    }
}
