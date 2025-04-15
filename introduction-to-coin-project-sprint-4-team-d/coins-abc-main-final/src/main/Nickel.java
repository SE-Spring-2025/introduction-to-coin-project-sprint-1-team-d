public class Nickel extends Coin {
    private static final double NICKEL_VALUE = 0.05;
    
    public Nickel(int year) {
        super(NICKEL_VALUE, "Nickel", "IN GOD WE TRUST", year,
              "T_Jefferson", "Jefferson_Memorial", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "FIVE CENTS",
              false, new CuproNickelMetallurgy());
    }
}
