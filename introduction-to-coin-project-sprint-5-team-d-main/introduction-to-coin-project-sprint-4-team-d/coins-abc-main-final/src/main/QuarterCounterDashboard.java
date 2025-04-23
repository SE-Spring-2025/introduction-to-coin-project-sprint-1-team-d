import javax.swing.*;
import java.awt.*;

public class QuarterCounterDashboard extends JFrame implements CoinCountObserver {
    private JLabel quarterLabel;

    public QuarterCounterDashboard(CoinCounts counts) {
        setTitle("Quarter Counter Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        quarterLabel = new JLabel("Quarters: 0");
        add(quarterLabel);

        counts.addObserver(this);

        pack();
        setVisible(true);
    }

    @Override
    public void update(CoinCounts counts) {
        quarterLabel.setText("Quarters: " + counts.getQuarterCount());
    }
} 