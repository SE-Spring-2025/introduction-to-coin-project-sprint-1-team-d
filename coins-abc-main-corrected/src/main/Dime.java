public class Dime extends Coin {
    public Dime(int year) {
        super(0.10, "Dime", "IN GOD WE TRUST", year,
              "F_Roosevelt", "Torch_Branches", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "ONE DIME",
              true, new CuproNickelMetallurgy());
    }
}
