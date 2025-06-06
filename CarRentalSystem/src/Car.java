public class Car {
    private String licensePlate;
    private String model;
    private String type;
    private boolean isRented;

    public Car(String licensePlate, String model, String type) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.type = type;
        this.isRented = false;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        isRented = true;
    }

    public void returnCar() {
        isRented = false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}