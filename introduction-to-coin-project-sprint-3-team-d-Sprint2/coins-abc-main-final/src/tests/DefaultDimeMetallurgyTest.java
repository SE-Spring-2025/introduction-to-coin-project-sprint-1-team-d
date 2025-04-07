import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DefaultDimeMetallurgyTest {
    @Test
    public void testSmelt() {
        Metallurgy m = new DefaultDimeMetallurgy();
        assertEquals("Metal Dime", m.smelt());
    }
}
