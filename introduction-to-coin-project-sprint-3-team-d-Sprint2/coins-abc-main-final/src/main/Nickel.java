public class Nickel extends Coin {
    public Nickel(int year) {
        super(0.05, "Nickel", "In God We Trust", 2023,
              "JeffersonFront.png", "MonticelloBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "Five Cents",
              false, new DefaultNickelMetallurgy());
    }

    public Nickel(Metallurgy smelter) {
        super(0.05, "Nickel", "In God We Trust", 2023,
              "JeffersonFront.png", "MonticelloBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "Five Cents",
              false, smelter);
    }

    public Nickel(int year, Metallurgy smelter) {
        super(0.05, "Nickel", "In God We Trust", year,
              "JeffersonFront.png", "MonticelloBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "Five Cents",
              false, smelter);
    }
}
