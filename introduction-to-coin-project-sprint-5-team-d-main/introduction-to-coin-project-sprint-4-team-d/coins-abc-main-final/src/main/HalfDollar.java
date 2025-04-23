public class HalfDollar extends Coin {
    private static final double HALF_DOLLAR_VALUE = 0.50;
    
    public HalfDollar(int year) {
        super(HALF_DOLLAR_VALUE, "HalfDollar", new CuproNickelMetallurgy());
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
        c.setFrontImage("J_Kennedy");
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
        c.setBackImage("Presidential_Seal");
        c.isBackImprinted = true;
        return c;
    }

    @Override
    protected Coin imprintBackMotto(Coin c) {
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("HALF DOLLAR");
        c.isBackMottoImprinted = true;
        return c;
    }
}
