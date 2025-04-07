public class Dollar extends Coin {
    public Dollar(int year) {
        super(1.00, "Dollar", "In God We Trust", 2023,
              "SacagaweaFront.png", "EagleBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "One Dollar",
              true, new DefaultDollarMetallurgy());
    }

    public Dollar(Metallurgy smelter) {
        super(1.00, "Dollar", "In God We Trust", 2023,
              "SacagaweaFront.png", "EagleBack.png", "E Pluribus Unum",
              "Liberty", "United States of America", "One Dollar",
              true, smelter);
    }


public Dollar(int year, Metallurgy smelter) {
    super(1.00, "Dollar", "In God We Trust", year,
          "SacagaweaFront.png", "EagleBack.png", "E Pluribus Unum",
          "Liberty", "United States of America", "One Dollar",
          true, smelter);
}
}
