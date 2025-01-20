import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.println("Enter hours parked for each customer (enter 0 to exit):");

        while (true) {
            System.out.print("Hours parked: ");
            double hoursParked = input.nextDouble();

            if (hoursParked == 0) {
                break; // Exit the loop if hours parked is 0
            }

            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;

            System.out.printf("Charge for this customer: $%.2f\n", charge);
            System.out.printf("Total receipts: $%.2f\n", totalReceipts);
        }

        System.out.println("Parking charges calculation complete.");
    }

    public static double calculateCharges(double hoursParked) {
        double charge;

        if (hoursParked <= 3.0) {
            charge = 2.00; // Base fee for up to 3 hours
        } else {
            charge = 2.00 + (hoursParked - 3.0) * 0.50; // Additional charge for exceeding 3 hours
            charge = Math.min(charge, 10.00); // Apply daily maximum
        }

        return charge;
    }
}