public class HalfDollar extends Coin {
    public HalfDollar(int year) {
        super(0.50, "Half Dollar", "In God We Trust", 2023,
              "KennedyFront.png", "PresidentialSealBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "Half Dollar",
              true, new DefaultHalfDollarMetallurgy());
    }

    public HalfDollar(Metallurgy smelter) {
        super(0.50, "Half Dollar", "In God We Trust", 2023,
              "KennedyFront.png", "PresidentialSealBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "Half Dollar",
              true, smelter);
    }

    public HalfDollar(int year, Metallurgy smelter) {
        super(0.50, "Half Dollar", "In God We Trust", year,
              "KennedyFront.png", "PresidentialSealBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "Half Dollar",
              true, smelter);
    }
}