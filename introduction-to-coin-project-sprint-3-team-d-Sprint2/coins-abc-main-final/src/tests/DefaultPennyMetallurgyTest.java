import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DefaultPennyMetallurgyTest {
    @Test
    public void testSmelt() {
        Metallurgy m = new DefaultPennyMetallurgy();
        assertEquals("Metal Penny", m.smelt());
    }
}
