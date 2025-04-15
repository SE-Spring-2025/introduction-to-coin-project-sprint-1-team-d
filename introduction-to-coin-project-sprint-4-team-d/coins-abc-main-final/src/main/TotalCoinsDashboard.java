import javax.swing.*;
import java.awt.*;

public class TotalCoinsDashboard extends JFrame implements CoinCountObserver {
    private JLabel totalLabel;

    public TotalCoinsDashboard(CoinCounts counts) {
        setTitle("Total Coins Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        totalLabel = new JLabel("Total Coins: 0");
        add(totalLabel);

        counts.addObserver(this);

        pack();
        setVisible(true);
    }

    @Override
    public void update(CoinCounts counts) {
        totalLabel.setText("Total Coins: " + counts.getTotalCoins());
    }
} 