import java.util.Scanner;

public class CandyMachine {
    private CashRegister register;
    private Dispenser<Product> candyDispenser;
    private Dispenser<Product> chipDispenser;
    private Dispenser<Product> gumDispenser;
    private Dispenser<Product> cookieDispenser;

    public CandyMachine() {
        register = new CashRegister(500); // Start with $5.00
        candyDispenser = new Dispenser<>(new Product("Candies"), 10, 50);
        chipDispenser = new Dispenser<>(new Product("Chips"), 10, 65);
        gumDispenser = new Dispenser<>(new Product("Gum"), 10, 35);
        cookieDispenser = new Dispenser<>(new Product("Cookies"), 10, 85);
    }

    public void displayProducts() {
        System.out.println("\nProducts Available:");
        System.out.println("1. Candies - $0.50");
        System.out.println("2. Chips   - $0.65");
        System.out.println("3. Gum     - $0.35");
        System.out.println("4. Cookies - $0.85");
    }

    public void sellProduct(Dispenser<Product> dispenser, Scanner scanner) {
        if (dispenser.getItemCount() <= 0) {
            System.out.println("Sorry, this item is sold out.");
            return;
        }

        int cost = dispenser.getItemCost();
        System.out.printf("%s costs $%.2f. Please enter your money (in cents): ",
                dispenser.getItem().getName(), cost / 100.0);
        int payment = scanner.nextInt();

        while (payment < cost) {
            System.out.printf("Insufficient funds. Please enter at least $%.2f more: ",
                    (cost - payment) / 100.0);
            payment += scanner.nextInt();
        }

        int change = payment - cost;
        register.acceptAmount(cost);
        dispenser.makeSale();

        System.out.printf("Thank you! Dispensing %s. Your change: $%.2f\n",
                dispenser.getItem().getName(), change / 100.0);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayProducts();
            System.out.print("\nSelect a product (1-4) or 0 to exit: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: sellProduct(candyDispenser, scanner); break;
                case 2: sellProduct(chipDispenser, scanner); break;
                case 3: sellProduct(gumDispenser, scanner); break;
                case 4: sellProduct(cookieDispenser, scanner); break;
                case 0:
                    running = false;
                    System.out.println("Thank you for using the candy machine!");
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        CandyMachine machine = new CandyMachine();
        machine.start();
    }
}
