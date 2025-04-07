import java.util.Scanner;
import java.util.Calendar;

public class Demo {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to the Coin Demo!");

        fixedDemo();
        interactiveDemo();

        System.out.println("\nThanks for watching the Coin Demo.");
        System.out.println("Have a wonderful day!\n");
    }

    private static void fixedDemo() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("\n--- Fixed Coin Demonstration ---\n");

        // Default metallurgy
        Coin[] defaultCoins = {
            new Penny(currentYear),
            new Nickel(currentYear),
            new Dime(currentYear),
            new Quarter(currentYear),
            new HalfDollar(currentYear),
            new Dollar(currentYear)
        };

        System.out.println("Default Metallurgy:");
        for (Coin coin : defaultCoins) {
            System.out.println(coin);
        }

        System.out.println("\nCustom Metallurgy (AlternateMetallurgy):");

        // Custom metallurgy
        Metallurgy alt = new AlternateMetallurgy();
        Coin[] customCoins = {
            new Penny(currentYear, alt),
            new Nickel(currentYear, alt),
            new Dime(currentYear, alt),
            new Quarter(currentYear, alt),
            new HalfDollar(currentYear, alt),
            new Dollar(currentYear, alt)
        };

        for (Coin coin : customCoins) {
            System.out.println(coin);
        }
    }

    private static void printMenu() {
        System.out.println("\n--- Interactive Coin Maker ---");
        System.out.println("Enter G for a Dollar");
        System.out.println("Enter H for a Half Dollar");
        System.out.println("Enter Q for a Quarter");
        System.out.println("Enter D for a Dime");
        System.out.println("Enter N for a Nickel");
        System.out.println("Enter P for a Penny");
        System.out.println("Enter X to exit");
        System.out.print("Your choice: ");
    }

    private static void interactiveDemo() {
        System.out.print("\nWould you like to make coins yourself? (Y/n): ");
        String response = keyboard.nextLine().trim();
        if (response.equalsIgnoreCase("y")) {
            runDemo();
        }
    }

    private static void runDemo() {
        Coin c;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        while (true) {
            printMenu();
            String response = keyboard.nextLine().trim();

            switch (response.toUpperCase()) {
                case "G":
                    c = new Dollar(currentYear);
                    System.out.println("You created a Dollar coin: " + c);
                    break;
                case "H":
                    c = new HalfDollar(currentYear);
                    System.out.println("You created a Half Dollar coin: " + c);
                    break;
                case "Q":
                    c = new Quarter(currentYear);
                    System.out.println("You created a Quarter coin: " + c);
                    break;
                case "D":
                    c = new Dime(currentYear);
                    System.out.println("You created a Dime coin: " + c);
                    break;
                case "N":
                    c = new Nickel(currentYear);
                    System.out.println("You created a Nickel coin: " + c);
                    break;
                case "P":
                    c = new Penny(currentYear);
                    System.out.println("You created a Penny coin: " + c);
                    break;
                case "X":
                    System.out.println("Exiting the demo.");
                    return;
                default:
                    System.out.println("Invalid entry, please try again.");
                    continue;
            }
        }
    }
}