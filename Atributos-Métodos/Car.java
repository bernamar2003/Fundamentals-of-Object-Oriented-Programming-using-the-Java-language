public class Car {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota Camry";
        myCar.year = 2022;

        System.out.println("Car Details:");
        System.out.println("Color: " + myCar.color);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);

        // Accelerate the car
        myCar.accelerate(30);
        // Brake the car
        myCar.brake(10);
    }
    private String color;
    private String model;
    private int year;
    private int currentSpeed;

    // Method to accelerate the car
    public void accelerate(int increment) {
        currentSpeed += increment;
        System.out.println("Car accelerated. Current speed: " + currentSpeed);
    }

    // Method to brake the car
    public void brake(int decrement) {
        currentSpeed -= decrement;
        if (currentSpeed < 0) {
            currentSpeed = 0; // Ensure speed doesn't go negative
        }
        System.out.println("Car braked. Current speed: " + currentSpeed);
    }

    // Method to get the current speed of the car
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}