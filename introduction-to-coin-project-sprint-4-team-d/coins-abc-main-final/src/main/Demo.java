import javax.swing.*;
import java.awt.*;

public class Demo {
    private static final int DEMO_YEAR = 2024;
    
    public static void main(String[] args) {
        // Create dashboards
        TotalCoinsDashboard totalDashboard = new TotalCoinsDashboard(Coin.getCoinCounts());
        QuarterCounterDashboard quarterDashboard = new QuarterCounterDashboard(Coin.getCoinCounts());

        // Create a penny with default copper metallurgy
        Penny penny = new Penny(DEMO_YEAR);
        System.out.println("Default Penny metallurgy: " + penny.getMetallurgy());

        // Create a penny with cupro-nickel metallurgy (demonstrating strategy)
        Penny experimentalPenny = new Penny(DEMO_YEAR);
        experimentalPenny.setMetallurgyStrategy(new CuproNickelMetallurgy());
        System.out.println("Experimental Penny metallurgy: " + experimentalPenny.getMetallurgy());

        // Demonstrate other coins with their default metallurgy
        System.out.println("\nOther coins with their default metallurgy:");
        System.out.println("Nickel: " + new Nickel(DEMO_YEAR).getMetallurgy());
        System.out.println("Dime: " + new Dime(DEMO_YEAR).getMetallurgy());
        System.out.println("Quarter: " + new Quarter(DEMO_YEAR).getMetallurgy());
        System.out.println("Half Dollar: " + new HalfDollar(DEMO_YEAR).getMetallurgy());
        System.out.println("Dollar: " + new Dollar(DEMO_YEAR).getMetallurgy());

        // Create a simple GUI for creating coins
        JFrame frame = new JFrame("Coin Manufacturing Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton quarterButton = new JButton("Create Quarter");
        JButton dimeButton = new JButton("Create Dime");
        JButton nickelButton = new JButton("Create Nickel");
        JButton pennyButton = new JButton("Create Penny");

        frame.add(quarterButton);
        frame.add(dimeButton);
        frame.add(nickelButton);
        frame.add(pennyButton);

        quarterButton.addActionListener(e -> new Quarter(DEMO_YEAR));
        dimeButton.addActionListener(e -> new Dime(DEMO_YEAR));
        nickelButton.addActionListener(e -> new Nickel(DEMO_YEAR));
        pennyButton.addActionListener(e -> new Penny(DEMO_YEAR));

        frame.pack();
        frame.setVisible(true);
    }
} 