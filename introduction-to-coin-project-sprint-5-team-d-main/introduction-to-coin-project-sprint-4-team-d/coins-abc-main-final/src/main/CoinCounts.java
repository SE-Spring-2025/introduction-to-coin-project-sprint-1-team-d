import java.util.ArrayList;
import java.util.List;

public class CoinCounts {
    private int totalCoins;
    private int quarterCount;
    private List<CoinCountObserver> observers;

    public CoinCounts() {
        this.totalCoins = 0;
        this.quarterCount = 0;
        this.observers = new ArrayList<>();
    }

    public void addObserver(CoinCountObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CoinCountObserver observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (CoinCountObserver observer : observers) {
            observer.update(this);
        }
    }

    public void incrementTotal() {
        totalCoins++;
        notifyObservers();
    }

    public void incrementQuarter() {
        quarterCount++;
        incrementTotal();
    }

    public int getTotalCoins() {
        return totalCoins;
    }

    public int getQuarterCount() {
        return quarterCount;
    }
} 