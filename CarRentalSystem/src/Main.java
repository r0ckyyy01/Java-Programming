import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        Scanner scanner = new Scanner(System.in);

        // User enters their details
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your customer ID:");
        String customerId = scanner.nextLine();
        Customer customer = new Customer(customerId, name);
        agency.addCustomer(customer);

        // Car details are predefined except model and type
        String licensePlate = "ABC 123X";
        System.out.println("Enter car type (Sedan, SUV, Truck):");
        String type = scanner.nextLine();
        System.out.println("Enter car model (Mercedes, BMW, Toyota):");
        String model = scanner.nextLine();
        Car car = new Car(licensePlate, type, model);
        agency.addCar(car);

        // User enters number of rental days
        System.out.println("Enter number of days you would like to rent the car for:");
        int rentalDays = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Rent the car
        RentalTransaction transaction = agency.rentCar(licensePlate, customerId, rentalDays);
        if (transaction != null) {
            System.out.println("\nYou have successfully rented the car!");
            System.out.println(transaction);
        } else {
            System.out.println("Car rental failed. The car may already be rented or your details are incorrect.");
        }

        // Show rental history
        System.out.println("\nRental history:");
        for (RentalTransaction t : agency.getRentalHistory()) {
            System.out.println(t);
        }

        scanner.close();
    }
}