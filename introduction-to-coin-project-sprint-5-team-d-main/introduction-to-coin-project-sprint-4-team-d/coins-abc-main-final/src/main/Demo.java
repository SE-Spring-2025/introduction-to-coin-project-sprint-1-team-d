import javax.swing.*;
import java.awt.*;

public class Demo {
    private static final int DEMO_YEAR = 2024;
    
    public static void main(String[] args) {
        // Create dashboards
        TotalCoinsDashboard totalDashboard = new TotalCoinsDashboard(Coin.getCoinCounts());
        QuarterCounterDashboard quarterDashboard = new QuarterCounterDashboard(Coin.getCoinCounts());

        // Demonstrate coin manufacturing process
        System.out.println("Demonstrating coin manufacturing process:");
        
        // Create and manufacture a dime
        Dime dime = new Dime(DEMO_YEAR);
        dime = (Dime) dime.manufacture(dime);
        System.out.println("\nDime manufacturing steps:");
        System.out.println("Smelted: " + dime.isSmelted());
        System.out.println("Edged: " + dime.isEdged());
        System.out.println("Front imprinted: " + dime.isFrontImprinted());
        System.out.println("Front motto imprinted: " + dime.isFrontMottoImprinted());
        System.out.println("Flipped: " + dime.isFlipped());
        System.out.println("Back imprinted: " + dime.isBackImprinted());
        System.out.println("Back motto imprinted: " + dime.isBackMottoImprinted());
        System.out.println("Buffed: " + dime.isBuffed());
        System.out.println("Final dime: " + dime);

        // Create a simple GUI for manufacturing coins
        JFrame frame = new JFrame("Coin Manufacturing Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton quarterButton = new JButton("Manufacture Quarter");
        JButton dimeButton = new JButton("Manufacture Dime");
        JButton nickelButton = new JButton("Manufacture Nickel");
        JButton pennyButton = new JButton("Manufacture Penny");

        frame.add(quarterButton);
        frame.add(dimeButton);
        frame.add(nickelButton);
        frame.add(pennyButton);

        quarterButton.addActionListener(e -> {
            Quarter quarter = new Quarter(DEMO_YEAR);
            quarter = (Quarter) quarter.manufacture(quarter);
            System.out.println("Manufactured Quarter: " + quarter);
        });
        
        dimeButton.addActionListener(e -> {
            Dime newDime = new Dime(DEMO_YEAR);
            newDime = (Dime) newDime.manufacture(newDime);
            System.out.println("Manufactured Dime: " + newDime);
        });
        
        nickelButton.addActionListener(e -> {
            Nickel nickel = new Nickel(DEMO_YEAR);
            nickel = (Nickel) nickel.manufacture(nickel);
            System.out.println("Manufactured Nickel: " + nickel);
        });
        
        pennyButton.addActionListener(e -> {
            Penny penny = new Penny(DEMO_YEAR);
            penny = (Penny) penny.manufacture(penny);
            System.out.println("Manufactured Penny: " + penny);
        });

        frame.pack();
        frame.setVisible(true);
    }
} 