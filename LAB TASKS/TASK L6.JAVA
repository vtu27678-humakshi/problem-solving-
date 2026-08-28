import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Premium");

        System.out.print("Choose ride: ");
        int choice = sc.nextInt();

        double rate;
        String ride;

        if (choice == 1) {
            ride = "Bike";
            rate = 10;
        } else if (choice == 2) {
            ride = "Car";
            rate = 15;
        } else if (choice == 3) {
            ride = "Premium";
            rate = 25;
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        double fare = distance * rate;

        System.out.println("\n--- Ride Details ---");
        System.out.println("Passenger: " + name);
        System.out.println("Ride Type: " + ride);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: Rs. " + fare);
        System.out.println("Ride Booked Successfully!");

        sc.close();
    }
}

INPUT
Rahul
10
2

OUTPUT
1. Bike
2. Car
3. Premium
Choose ride: 2

--- Ride Details ---
Passenger: Rahul
Ride Type: Car
Distance: 10.0 km
Total Fare: Rs. 150.0
Ride Booked Successfully!

CONCEPT
Passenger
    ↓
Enter Distance
    ↓
Choose Ride
    ↓
Calculate Fare
    ↓
Display Ride Details
    ↓
Ride Booked