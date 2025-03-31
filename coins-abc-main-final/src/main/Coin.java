import java.text.DecimalFormat;

public abstract class Coin {
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

    public Coin(double value, String familiarName, String frontMotto, int manufactureYear,
                String frontImage, String backImage, String backMotto,
                String frontLabel, String backLabel, String valueDescription,
                boolean ridgedEdge, String metallurgy) {
        this.value = value;
        this.familiarName = familiarName;
        this.frontMotto = frontMotto;
        this.manufactureYear = manufactureYear;
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.backMotto = backMotto;
        this.frontLabel = frontLabel;
        this.backLabel = backLabel;
        this.valueDescription = valueDescription;
        this.ridgedEdge = ridgedEdge;
        this.metallurgy = metallurgy;
    }

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
            + ",'" + metallurgy
            + "']";
    }
}
