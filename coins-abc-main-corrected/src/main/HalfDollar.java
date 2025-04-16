public class HalfDollar extends Coin {
    public HalfDollar(int year) {
        super(0.50, "HalfDollar", "IN GOD WE TRUST", year,
              "J_Kennedy", "Presidential_Seal", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "HALF DOLLAR",
              true, new CuproNickelMetallurgy());
    }
}
