public class Nickel extends Coin {
    private static final double NICKEL_VALUE = 0.05;
    
    public Nickel(int year) {
        super(NICKEL_VALUE, "Nickel", new CuproNickelMetallurgy());
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
        c.setFrontImage("T_Jefferson");
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
        c.setBackImage("Jefferson_Memorial");
        c.isBackImprinted = true;
        return c;
    }

    @Override
    protected Coin imprintBackMotto(Coin c) {
        c.setBackMotto("E PLURIBUS UNUM");
        c.setBackLabel("UNITED STATES OF AMERICA");
        c.setValueDescription("FIVE CENTS");
        c.isBackMottoImprinted = true;
        return c;
    }
}
