public class Dime extends Coin {
    public Dime(int year) {
        super(0.10, "Dime", "In God We Trust", 2023,
              "RooseveltFront.png", "TorchBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "One Dime",
              true, new DefaultDimeMetallurgy());
    }

    public Dime(Metallurgy smelter) {
        super(0.10, "Dime", "In God We Trust", 2023,
              "RooseveltFront.png", "TorchBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "One Dime",
              true, smelter);
    }

    public Dime(int year, Metallurgy smelter) {
        super(0.10, "Dime", "In God We Trust", year,
              "RooseveltFront.png", "TorchBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "One Dime",
              true, smelter);
    }
}
