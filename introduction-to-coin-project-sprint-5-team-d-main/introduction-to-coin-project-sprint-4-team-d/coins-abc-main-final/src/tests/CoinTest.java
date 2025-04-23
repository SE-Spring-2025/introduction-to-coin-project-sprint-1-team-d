import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinTest {

    @Test
    public void testGetters() {
        Coin c = new MockCoin();
        assertEquals("Mock", c.getFamiliarName());
        assertEquals(0.24, c.getValue(), 0.0001);
        assertEquals("frontMotto", c.getFrontMotto());
        assertEquals("backMotto", c.getBackMotto());
        assertEquals("LIBERTY", c.getFrontLabel());
        assertEquals("USA", c.getBackLabel());
        assertEquals("frontImage", c.getFrontImage());
        assertEquals("backImage", c.getBackImage());
        assertEquals("twenty-four cents", c.getValueDescription());
        assertFalse(c.getRidgedEdge());
        assertEquals("FakeMetal", c.getMetallurgy());
        assertEquals(1999, c.getYear());
    }

    @Test
    public void testToString() {
        Coin c = new MockCoin();
        String expected = "[Mock,0.24,1999,'frontMotto','backMotto','frontImage','backImage','LIBERTY','USA','twenty-four cents',smooth,'FakeMetal']";
        assertEquals(expected, c.toString());
    }

    @Test
    public void testSetMetallurgyStrategy() {
        Coin c = new MockCoin();
        assertEquals("FakeMetal", c.getMetallurgy());
        
        // Change the metallurgy strategy
        c.setMetallurgyStrategy(new CopperMetallurgy());
        assertEquals("Copper", c.getMetallurgy());
        
        // Change it again
        c.setMetallurgyStrategy(new CuproNickelMetallurgy());
        assertEquals("Cupro-Nickel", c.getMetallurgy());
    }

    class MockCoin extends Coin {
        public MockCoin() {
            super(0.24, "Mock", "frontMotto", 1999,
                  "frontImage", "backImage", "backMotto",
                  "LIBERTY", "USA", "twenty-four cents", false, new FakeMetallurgy());
        }
    }
    
    class FakeMetallurgy implements Metallurgy {
        @Override
        public String smelt() {
            return "FakeMetal";
        }
    }
} 
