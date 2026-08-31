import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double amount = price * quantity;
            total = total + amount;

            System.out.println("Item amount = " + amount);
        }

        double discount = 0;

        if (total >= 1000) {
            discount = total * 0.10;
        } else if (total >= 500) {
            discount = total * 0.05;
        }

        double finalAmount = total - discount;

        System.out.println("\n--- SUPERMARKET BILL ---");
        System.out.println("Total Amount = " + total);
        System.out.println("Discount = " + discount);
        System.out.println("Final Amount = " + finalAmount);

        sc.close();
    }
}

INPUT
Enter number of items: 3

Enter price of item 1: 200
Enter quantity: 2

Enter price of item 2: 300
Enter quantity: 1

Enter price of item 3: 500
Enter quantity: 1

OUTPUT

Item amount = 400.0
Item amount = 300.0
Item amount = 500.0

--- SUPERMARKET BILL ---
Total Amount = 1200.0
Discount = 120.0
Final Amount = 1080.0