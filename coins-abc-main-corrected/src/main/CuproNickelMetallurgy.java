/**
 * Concrete implementation of the Metallurgy interface for cupro-nickel coins.
 */
public class CuproNickelMetallurgy implements Metallurgy {
    /**
     * Returns the metallurgy description for cupro-nickel coins.
     * @return the metallurgy description
     */
    @Override
    public String smelt() {
        return "Cupro-Nickel";
    }
} 