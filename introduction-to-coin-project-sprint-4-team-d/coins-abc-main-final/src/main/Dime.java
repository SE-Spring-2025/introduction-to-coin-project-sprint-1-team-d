public class Dime extends Coin {
    private static final double DIME_VALUE = 0.10;
    
    public Dime(int year) {
        super(DIME_VALUE, "Dime", "IN GOD WE TRUST", year,
              "F_Roosevelt", "Torch_Branches", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "ONE DIME",
              true, new CuproNickelMetallurgy());
    }
}
