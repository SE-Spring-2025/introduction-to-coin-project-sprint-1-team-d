public class Quarter extends Coin {
    public Quarter(int year) {
        super(0.25, "Quarter", "In God We Trust", 2023,
              "WashingtonFront.png", "EagleBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "Quarter Dollar",
              true, new DefaultQuarterMetallurgy());
    }

    public Quarter(Metallurgy smelter) {
        super(0.25, "Quarter", "In God We Trust", 2023,
              "WashingtonFront.png", "EagleBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "Quarter Dollar",
              true, smelter);
    }

    public Quarter(int year, Metallurgy smelter) {
        super(0.25, "Quarter", "In God We Trust", year,
              "WashingtonFront.png", "EagleBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "Quarter Dollar",
              true, smelter);
    }
}