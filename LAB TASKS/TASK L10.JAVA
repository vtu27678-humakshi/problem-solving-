import java.util.Scanner;

public class Main {

    static String username = "admin";
    static String password = "12345";
    static int failedAttempts = 0;
    static boolean locked = false;

    static boolean authenticate(String user, String pass) {

        if (locked) {
            return false;
        }

        if (user.equals(username) && pass.equals(password)) {
            failedAttempts = 0;
            return true;
        }

        failedAttempts++;

        if (failedAttempts >= 3) {
            locked = true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of login attempts: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nAttempt " + i);

            System.out.print("Enter username: ");
            String user = sc.next();

            System.out.print("Enter password: ");
            String pass = sc.next();

            if (authenticate(user, pass)) {
                System.out.println("Login Successful");
            } else {
                if (locked)
                    System.out.println("Account Locked");
                else
                    System.out.println("Login Failed");
            }
        }

        System.out.println("\nStress Test Completed");
        System.out.println("Total Attempts: " + n);

        sc.close();
    }
}

INPUT
Enter number of login attempts: 4

Attempt 1
Enter username: admin
Enter password: 1111

Attempt 2
Enter username: admin
Enter password: 2222

Attempt 3
Enter username: admin
Enter password: 3333

Attempt 4
Enter username: admin
Enter password: 12345

OUTPUT
Login Failed
Login Failed
Account Locked
Account Locked

Stress Test Completed
Total Attempts: 4