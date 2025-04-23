public class Dollar extends Coin {
    private static final double DOLLAR_VALUE = 1.00;
    
    public Dollar(int year) {
        super(DOLLAR_VALUE, "Dollar", new CuproNickelMetallurgy());
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
        c.setRidgedEdge(true);
        c.isEdged = true;
        return c;
    }

    @Override
    protected Coin imprintFront(Coin c) {
        c.setFrontImage("S_Anthony");
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
        c.setBackImage("Moon_Eagle");
        c.isBackImprinted = true;
        return c;
    }

    @Override
    protected Coin imprintBackMotto(Coin c) {
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("ONE DOLLAR");
        c.isBackMottoImprinted = true;
        return c;
    }
}
