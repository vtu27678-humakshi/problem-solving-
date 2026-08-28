import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        int choice;

        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Transaction Completed");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}

INPUT
10000
1
5000
2
3000
3
4

OUTPUT
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Balance: 15000.0

1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Balance: 12000.0

1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Balance: 12000.0

1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Transaction Completed


CONCEPT
Starting Balance
      ↓
Choose Transaction
   ↙   ↓    ↓    ↘
Deposit Withdraw Balance Exit
   ↓       ↓       ↓
 +Amount  -Amount  Display
      ↓
 Updated Balance