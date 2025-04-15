public class Penny extends Coin {
    private static final double PENNY_VALUE = 0.01;
    
    public Penny(int year) {
        super(PENNY_VALUE, "Penny", "IN GOD WE TRUST", year,
              "A_Lincoln", "Lincoln_Memorial", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "ONE CENT",
              false, new CopperMetallurgy());
    }
}
