/**
 * Concrete implementation of the Metallurgy interface for copper coins.
 */
public class CopperMetallurgy implements Metallurgy {
    /**
     * Returns the metallurgy description for copper coins.
     * @return the metallurgy description
     */
    @Override
    public String smelt() {
        return "Copper";
    }
} 