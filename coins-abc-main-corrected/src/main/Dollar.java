public class Dollar extends Coin {
    public Dollar(int year) {
        super(1.00, "Dollar", "IN GOD WE TRUST", year,
              "S_Anthony", "Moon_Eagle", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "ONE DOLLAR",
              true, new CuproNickelMetallurgy());
    }
}
