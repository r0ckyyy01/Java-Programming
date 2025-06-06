# Car Rental System (Java OOP)

This is a simple console-based Car Rental System implemented in Java using Object-Oriented Programming (OOP) principles.  
It demonstrates basic OOP concepts such as encapsulation, composition, and modular design with classes for `Car`, `Customer`, `RentalAgency`, and `RentalTransaction`.

## Features

- **Customer Management:** Register new customers.
- **Car Management:** Add new cars (with a predefined license plate for the demo).
- **Car Rental:** Rent a car by entering your details, car details, and rental duration.
- **Rental Receipt:** Print transaction details as a receipt after a successful rental.
- **Rental History:** View all transactions.

## How to Run

1. **Compile All Files**
    ```sh
    javac Main.java Car.java Customer.java RentalAgency.java RentalTransaction.java
    ```

2. **Run the Program**
    ```sh
    java Main
    ```

## Usage

When you run the program, you will be prompted to enter:

1. **Your Name**
2. **Your Customer ID**
3. **Car Model** (e.g., Corolla)
4. **Car Type** (e.g., Sedan, SUV)
5. **Number of Days to Rent the Car**

The license plate is predefined as `ABC 123X` for demonstration.

After entering the details:

- If the rental is successful, you will see a success message and a formatted rental receipt.
- The program also prints out the entire rental history at the end of execution.

### Example Interaction

```
Enter your name:
Alice
Enter your customer ID:
C001
Enter car model:
Corolla
Enter car type (e.g., Sedan, SUV):
Sedan
Enter number of days you would like to rent the car for:
3

You have successfully rented the car!
----- Rental Receipt -----
Customer Name: Alice
Customer ID: C001
Car Model: Corolla
Car Type: Sedan
License Plate: ABC 123X
Rental Start Date: 2025-06-06
Rental Days: 3
Return Date: 2025-06-09
-------------------------

Rental history:
----- Rental Receipt -----
Customer Name: Alice
Customer ID: C001
Car Model: Corolla
Car Type: Sedan
License Plate: ABC 123X
Rental Start Date: 2025-06-06
Rental Days: 3
Return Date: 2025-06-09
-------------------------
```

## File Structure

- `Main.java` - Main class; handles user interaction and program flow.
- `Car.java` - Car entity.
- `Customer.java` - Customer entity.
- `RentalAgency.java` - Manages customers, cars, and rental transactions.
- `RentalTransaction.java` - Stores details of each rental.

---
**Author:** r0ckyyy01