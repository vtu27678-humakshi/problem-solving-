import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;
        double amount = sc.nextDouble();

        // Constraints:
        // 1. Amount must be positive
        // 2. Amount must not exceed balance

        if (amount <= 0) {
            System.out.println("Invalid Amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);
        }

        sc.close();
    }
}

INPUT
2000

OUTPUT
Transaction Successful
Remaining Balance: 3000.0