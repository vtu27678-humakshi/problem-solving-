import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        int choice = sc.nextInt();

        if (choice == 1) {
            double amount = sc.nextDouble();
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Balance: " + balance);
        }
        else if (choice == 2) {
            double amount = sc.nextDouble();

            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
                System.out.println("Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        else if (choice == 3) {
            System.out.println("Balance: " + balance);
        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

INPUT
1
2000

OUTPUT
Deposited: 2000.0
Balance: 7000.0