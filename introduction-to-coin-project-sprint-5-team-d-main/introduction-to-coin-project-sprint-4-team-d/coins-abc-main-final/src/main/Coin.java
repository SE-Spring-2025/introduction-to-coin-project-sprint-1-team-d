import java.text.DecimalFormat;

public abstract class Coin {
    protected static CoinCounts coinCounts = new CoinCounts();
    private String familiarName;
    private double value;
    private String frontMotto;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String frontImage;
    private String backImage;
    private String valueDescription;
    private boolean ridgedEdge;
    private String metallurgy;
    private int manufactureYear;
    protected Metallurgy smelter;
    
    // New fields to track manufacturing state
    protected boolean isSmelted = false;
    protected boolean isEdged = false;
    protected boolean isFrontImprinted = false;
    protected boolean isFrontMottoImprinted = false;
    protected boolean isFlipped = false;
    protected boolean isBackImprinted = false;
    protected boolean isBackMottoImprinted = false;
    protected boolean isBuffed = false;

    public Coin(double value, String familiarName, Metallurgy smelter) {
        this.value = value;
        this.familiarName = familiarName;
        this.smelter = smelter;
        coinCounts.incrementTotal();
    }

    // Template method for manufacturing process
    public final Coin manufacture(Coin c0) {
        Coin c1 = smelt(c0);
        Coin c2 = edge(c1);
        Coin c3 = imprintFront(c2);
        Coin c4 = imprintFrontMotto(c3);
        Coin c5 = flip(c4);
        Coin c6 = imprintBack(c5);
        Coin c7 = imprintBackMotto(c6);
        return buff(c7);
    }

    // Common methods with default implementations
    protected Coin flip(Coin c) {
        c.isFlipped = true;
        return c;
    }

    protected Coin buff(Coin c) {
        c.isBuffed = true;
        return c;
    }

    // Abstract methods that must be implemented by concrete classes
    protected abstract Coin smelt(Coin c);
    protected abstract Coin edge(Coin c);
    protected abstract Coin imprintFront(Coin c);
    protected abstract Coin imprintFrontMotto(Coin c);
    protected abstract Coin imprintBack(Coin c);
    protected abstract Coin imprintBackMotto(Coin c);

    // Getters for manufacturing state
    public boolean isSmelted() { return isSmelted; }
    public boolean isEdged() { return isEdged; }
    public boolean isFrontImprinted() { return isFrontImprinted; }
    public boolean isFrontMottoImprinted() { return isFrontMottoImprinted; }
    public boolean isFlipped() { return isFlipped; }
    public boolean isBackImprinted() { return isBackImprinted; }
    public boolean isBackMottoImprinted() { return isBackMottoImprinted; }
    public boolean isBuffed() { return isBuffed; }

    // Existing getters
    public static CoinCounts getCoinCounts() { return coinCounts; }
    public String getFamiliarName() { return familiarName; }
    public double getValue() { return value; }
    public String getFrontMotto() { return frontMotto; }
    public String getBackMotto() { return backMotto; }
    public String getFrontLabel() { return frontLabel; }
    public String getBackLabel() { return backLabel; }
    public String getFrontImage() { return frontImage; }
    public String getBackImage() { return backImage; }
    public String getValueDescription() { return valueDescription; }
    public boolean getRidgedEdge() { return ridgedEdge; }
    public String getMetallurgy() { return metallurgy; }
    public int getYear() { return manufactureYear; }

    // Setters for manufacturing process
    protected void setFrontMotto(String motto) { this.frontMotto = motto; }
    protected void setBackMotto(String motto) { this.backMotto = motto; }
    protected void setFrontLabel(String label) { this.frontLabel = label; }
    protected void setBackLabel(String label) { this.backLabel = label; }
    protected void setFrontImage(String image) { this.frontImage = image; }
    protected void setBackImage(String image) { this.backImage = image; }
    protected void setValueDescription(String desc) { this.valueDescription = desc; }
    protected void setRidgedEdge(boolean ridged) { this.ridgedEdge = ridged; }
    protected void setMetallurgy(String metal) { this.metallurgy = metal; }
    protected void setYear(int year) { this.manufactureYear = year; }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedValue = df.format(value);

        return "[" + familiarName
            + "," + formattedValue
            + "," + manufactureYear
            + ",'" + frontMotto
            + "','" + backMotto
            + "','" + frontImage
            + "','" + backImage
            + "','" + frontLabel
            + "','" + backLabel
            + "','" + valueDescription
            + "'," + (ridgedEdge ? "ridges" : "smooth")
            + "','" + metallurgy
            + "']";
    }
}
