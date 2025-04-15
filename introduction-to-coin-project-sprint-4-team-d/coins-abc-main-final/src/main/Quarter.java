public class Quarter extends Coin {
    private static final double QUARTER_VALUE = 0.25;
    
    public Quarter(int year) {
        super(QUARTER_VALUE, "Quarter", "IN GOD WE TRUST", year,
              "G_Washington", "Eagle", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "QUARTER DOLLAR",
              true, new CuproNickelMetallurgy());
        coinCounts.incrementQuarter();
    }
}
