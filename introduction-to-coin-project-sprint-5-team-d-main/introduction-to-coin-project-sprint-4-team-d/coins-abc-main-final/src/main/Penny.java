public class Penny extends Coin {
    private static final double PENNY_VALUE = 0.01;
    
    public Penny(int year) {
        super(PENNY_VALUE, "Penny", new CopperMetallurgy());
        setYear(year);
    }

    @Override
    protected Coin smelt(Coin c) {
        c.setMetallurgy(smelter.smelt());
        c.isSmelted = true;
        return c;
    }

    @Override
    protected Coin edge(Coin c) {
        c.setRidgedEdge(false);
        c.isEdged = true;
        return c;
    }

    @Override
    protected Coin imprintFront(Coin c) {
        c.setFrontImage("A_Lincoln");
        c.isFrontImprinted = true;
        return c;
    }

    @Override
    protected Coin imprintFrontMotto(Coin c) {
        c.setFrontMotto("IN GOD WE TRUST");
        c.setFrontLabel("LIBERTY");
        c.isFrontMottoImprinted = true;
        return c;
    }

    @Override
    protected Coin imprintBack(Coin c) {
        c.setBackImage("Lincoln_Memorial");
        c.isBackImprinted = true;
        return c;
    }

    @Override
    protected Coin imprintBackMotto(Coin c) {
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("ONE CENT");
        c.isBackMottoImprinted = true;
        return c;
    }
}
