public class Penny extends Coin {
    public Penny(int year) {
        super(0.01, "Penny", "In God We Trust", 2023,
              "LincolnFront.png", "LincolnBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "One Cent",
              false, new DefaultPennyMetallurgy());
    }

    public Penny(Metallurgy smelter) {
        super(0.01, "Penny", "In God We Trust", 2023,
              "LincolnFront.png", "LincolnBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "One Cent",
              false, smelter);
    }
    public Penny(int year, Metallurgy smelter) {
        super(0.01, "Penny", "In God We Trust", year,
              "LincolnFront.png", "LincolnBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "One Cent",
              false, smelter);
    }
}
