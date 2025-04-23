public class Quarter extends Coin {
    private static final double QUARTER_VALUE = 0.25;
    
    public Quarter(int year) {
        super(QUARTER_VALUE, "Quarter", new CuproNickelMetallurgy());
        setYear(year);
        coinCounts.incrementQuarter();
    }

    @Override
    protected Coin smelt(Coin c) {
        c.setMetallurgy(smelter.smelt());
        c.isSmelted = true;
        return c;
    }

    @Override
    protected Coin edge(Coin c) {
        c.setRidgedEdge(true);
        c.isEdged = true;
        return c;
    }

    @Override
    protected Coin imprintFront(Coin c) {
        c.setFrontImage("G_Washington");
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
        c.setBackImage("Eagle");
        c.isBackImprinted = true;
        return c;
    }

    @Override
    protected Coin imprintBackMotto(Coin c) {
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("QUARTER DOLLAR");
        c.isBackMottoImprinted = true;
        return c;
    }
}
