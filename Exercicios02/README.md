# Smartphone Control

A simple Java project that simulates the basic behavior of a smartphone using Object-Oriented Programming (OOP) concepts.

## Features

- Turn the smartphone on.
- Turn the smartphone off.
- Charge the battery.
- Consume battery power.
- Display the current smartphone status.

## Project Structure

```text
SmartphoneProject/
├── Main.java
├── Smartphone.java
└── README.md
```

## Attributes

| Attribute | Type | Description |
|----------|------|-------------|
| `brand` | `String` | The smartphone brand. |
| `model` | `String` | The smartphone model. |
| `battery` | `int` | The battery level (0–100). |
| `poweredOn` | `boolean` | Indicates whether the smartphone is powered on. |

## Methods

| Method | Description |
|--------|-------------|
| `turnOn()` | Turns on the smartphone if the battery is not empty. |
| `turnOff()` | Turns off the smartphone. |
| `chargeBattery()` | Charges the battery without exceeding 100%. |
| `useBattery(int percent)` | Consumes the specified percentage of battery power. |
| `showStatus()` | Displays the current status of the smartphone. |

## Business Rules

- The battery level can never exceed **100%**.
- The smartphone cannot be turned on if the battery level is **0%**.
- If the battery reaches **0%** while the smartphone is in use, it automatically powers off.
- Battery power cannot be consumed while the smartphone is turned off.

## How to Run the Project

Make sure you have Java installed on your machine. You can verify your Java installation by running:

```bash
java -version
```

### Compile the Project

Open the terminal inside the project folder where `Main.java` and `Smartphone.java` are located.

Compile all Java files:

```bash
javac *.java
```

### Run the Application

After successful compilation, run the `Main` class:

```bash
java Main
```

### Important Note

The `Smartphone` class does not contain a `main()` method because it is a model class responsible for representing the smartphone object and its behaviors.

The application should always be executed through the `Main` class, which creates the smartphone object and tests its functionality.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- A terminal or IDE capable of compiling and running Java applications.


## Example Usage

```java
public class Main {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone("Samsung", "Galaxy S24", 50);

        phone.showStatus();

        phone.turnOn();
        phone.useBattery(20);

        phone.chargeBattery();

        phone.showStatus();
    }
}
```

## Example Output

```text
===== SMARTPHONE STATUS =====
Brand: Samsung
Model: Galaxy S24
Battery: 50%
Powered On: No
=============================

Smartphone powered on.
20% of the battery has been used.
Battery charged. Current level: 50%

===== SMARTPHONE STATUS =====
Brand: Samsung
Model: Galaxy S24
Battery: 50%
Powered On: Yes
=============================
```

## Concepts Practiced

- Object-Oriented Programming (OOP)
- Classes and Objects
- Attributes
- Methods
- Constructors
- Encapsulation
- Conditional Statements (`if` and `else`)
- Object State Management

## Author

**Bernardo Martins**