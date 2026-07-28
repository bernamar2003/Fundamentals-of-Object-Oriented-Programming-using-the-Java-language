public class Car {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota Camry";
        myCar.year = 2022;
        myCar.currentSpeed = 0;

        System.out.println("Car Details:");
        System.out.println("Color: " + myCar.color);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Current Speed: " + myCar.getCurrentSpeed());

        myCar.startEngine();
        myCar.accelerate(30);
        myCar.brake(10);
        myCar.stopEngine();
    }

    private String color;
    private String model;
    private int year;
    private int currentSpeed;

    // Start the engine
    public void startEngine() {
        if (currentSpeed == 0) {
            System.out.println("Motor ligado.");
            currentSpeed = 1; // Indica que o motor está ligado.
        } else {
            System.out.println("Carro já está funcionando.");
        }
    }

    // Stop the engine
    public void stopEngine() {
        currentSpeed = 0;
        System.out.println("Motor parado");
    }

    // Accelerate the car
    public void accelerate(int increment) {
        if (currentSpeed == 0) {
            System.out.println("Não é possível acelerar. O motor está desligado.");
            return;
        }

        currentSpeed += increment;
        System.out.println("Car accelerated. Current speed: " + currentSpeed);
    }

    // Brake the car
    public void brake(int decrement) {
        currentSpeed -= decrement;

        if (currentSpeed < 0) {
            currentSpeed = 0;
        }

        System.out.println("Car braked. Current speed: " + currentSpeed);
    }

    // Get current speed
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}