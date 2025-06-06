import java.time.LocalDate;

public class RentalTransaction {
    private Car car;
    private Customer customer;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private int rentalDays;

    public RentalTransaction(Car car, Customer customer, LocalDate rentalDate, int rentalDays) {
        this.car = car;
        this.customer = customer;
        this.rentalDate = rentalDate;
        this.rentalDays = rentalDays;
        this.returnDate = rentalDate.plusDays(rentalDays);
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    @Override
    public String toString() {
        return "----- Rental Receipt -----\n" +
                "Customer Name: " + customer.getName() + "\n" +
                "Customer ID: " + customer.getCustomerId() + "\n" +
                "Car Model: " + car.getModel() + "\n" +
                "Car Type: " + car.getType() + "\n" +
                "License Plate: " + car.getLicensePlate() + "\n" +
                "Rental Start Date: " + rentalDate + "\n" +
                "Rental Days: " + rentalDays + "\n" +
                "Return Date: " + returnDate + "\n" +
                "-------------------------";
    }
}