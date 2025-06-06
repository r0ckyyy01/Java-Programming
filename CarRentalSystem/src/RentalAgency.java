import java.util.*;

public class RentalAgency {
    private Map<String, Car> cars;
    private Map<String, Customer> customers;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        cars = new HashMap<>();
        customers = new HashMap<>();
        transactions = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.put(car.getLicensePlate(), car);
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public RentalTransaction rentCar(String licensePlate, String customerId, int rentalDays) {
        Car car = cars.get(licensePlate);
        Customer customer = customers.get(customerId);
        if (car != null && !car.isRented() && customer != null) {
            car.rent();
            RentalTransaction transaction = new RentalTransaction(car, customer, java.time.LocalDate.now(), rentalDays);
            transactions.add(transaction);
            return transaction;
        }
        return null;
    }

    public boolean returnCar(String licensePlate) {
        for (RentalTransaction transaction : transactions) {
            if (transaction.getCar().getLicensePlate().equals(licensePlate) && transaction.getCar().isRented()) {
                transaction.getCar().returnCar();
                return true;
            }
        }
        return false;
    }

    public List<Car> getAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars.values()) {
            if (!car.isRented()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public List<RentalTransaction> getRentalHistory() {
        return transactions;
    }
}