import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSlots = 5;
        int occupiedSlots = 0;

        System.out.println("SMART PARKING MANAGEMENT SYSTEM");

        System.out.print("Enter number of cars to park: ");
        int cars = sc.nextInt();

        for (int i = 1; i <= cars; i++) {

            if (occupiedSlots < totalSlots) {
                occupiedSlots++;
                System.out.println("Car " + i + " parked successfully.");
                System.out.println("Available slots: "
                        + (totalSlots - occupiedSlots));
            } else {
                System.out.println("Parking Full!");
            }
        }

        System.out.println("\n--- Parking Status ---");
        System.out.println("Total Slots: " + totalSlots);
        System.out.println("Occupied Slots: " + occupiedSlots);
        System.out.println("Available Slots: "
                + (totalSlots - occupiedSlots));

        sc.close();
    }
}

INPUT
SMART PARKING MANAGEMENT SYSTEM
Enter number of cars to park: 7

OUTPUT
Car 1 parked successfully.
Available slots: 4

Car 2 parked successfully.
Available slots: 3

Car 3 parked successfully.
Available slots: 2

Car 4 parked successfully.
Available slots: 1

Car 5 parked successfully.
Available slots: 0

Parking Full!
Parking Full!

--- Parking Status ---
Total Slots: 5
Occupied Slots: 5
Available Slots: 0
