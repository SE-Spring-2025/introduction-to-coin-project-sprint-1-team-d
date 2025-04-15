public class Dollar extends Coin {
    private static final double DOLLAR_VALUE = 1.00;
    
    public Dollar(int year) {
        super(DOLLAR_VALUE, "Dollar", "IN GOD WE TRUST", year,
              "S_Anthony", "Moon_Eagle", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "ONE DOLLAR",
              true, new CuproNickelMetallurgy());
    }
}
