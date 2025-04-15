public class HalfDollar extends Coin {
    private static final double HALF_DOLLAR_VALUE = 0.50;
    
    public HalfDollar(int year) {
        super(HALF_DOLLAR_VALUE, "HalfDollar", "IN GOD WE TRUST", year,
              "J_Kennedy", "Presidential_Seal", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "HALF DOLLAR",
              true, new CuproNickelMetallurgy());
    }
}
