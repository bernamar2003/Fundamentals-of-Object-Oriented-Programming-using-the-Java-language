# Java - Classes and Objects

This repository contains my studies on the fundamental concepts of **Object-Oriented Programming (OOP)** in Java, focusing on **Classes** and **Objects**.

---

# What is Object-Oriented Programming?

**Object-Oriented Programming (OOP)** is a programming paradigm that organizes code into **objects**, making software more modular, reusable, and easier to maintain.

The two fundamental concepts are:

- Classes
- Objects

---

# Classes

A **class** is a blueprint used to create objects.

A class defines:

- **Attributes (fields):** the characteristics of an object.
- **Methods:** the actions an object can perform.

Example:

```java
class Dog {

    String breed;
    String name;
    int age;

    void bark() {
        System.out.println("Woof!");
    }

    void displayDetails() {
        System.out.println(
            "Breed: " + breed +
            ", Name: " + name +
            ", Age: " + age
        );
    }
}
```

In this example:

- `breed`, `name`, and `age` are attributes.
- `bark()` and `displayDetails()` are methods.

---

# Objects

An **object** is an instance of a class.

Each object has its own values for the attributes defined in the class.

Creating an object:

```java
Dog myDog = new Dog();
```

The `new` keyword allocates memory and creates a new object.

---

# Accessing Attributes and Methods

After creating an object, you can access its attributes and methods using the dot (`.`) operator.

```java
myDog.breed = "Golden Retriever";
myDog.name = "Buddy";
myDog.age = 3;

myDog.bark();
myDog.displayDetails();
```

Output:

```text
Woof!
Breed: Golden Retriever, Name: Buddy, Age: 3
```

---

# Attributes (Fields)

Attributes represent the **state** of an object.

Each object maintains its own set of attribute values.

Example:

```java
String breed;
String name;
int age;
```

---

# Methods

Methods define the **behavior** of an object.

They can:

- Execute actions
- Receive parameters
- Return values

Example:

```java
void bark() {
    System.out.println("Woof!");
}
```

---

# Encapsulation

A common Java best practice is to protect attributes by declaring them as `private`.

Access to these attributes is provided through public methods, commonly known as **getters** and **setters**.

Example:

```java
class Car {

    public String model;
    private int speed;

    public void setSpeed(int speed) {

        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        }

    }

    public int getSpeed() {
        return speed;
    }

}
```

Usage:

```java
Car myCar = new Car();

myCar.model = "Tesla Model 3";

myCar.setSpeed(100);

System.out.println(myCar.getSpeed());
```

### Benefits of Encapsulation

- Protects object data
- Prevents invalid values
- Improves code maintainability
- Allows data validation

---

# Methods with Parameters and Return Values

Methods can receive input values and return results.

Example:

```java
class Rectangle {

    int width;
    int height;

    void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calculateArea() {
        return width * height;
    }

}
```

Usage:

```java
Rectangle rectangle = new Rectangle();

rectangle.setDimensions(5, 10);

int area = rectangle.calculateArea();

System.out.println(area);
```

Output:

```text
50
```

---

# Topics Covered

By completing this study, I learned the following concepts:

- What is Object-Oriented Programming (OOP)
- Classes
- Objects
- Creating objects with `new`
- Attributes (Fields)
- Methods
- Dot (`.`) operator
- Encapsulation
- Access modifiers (`public` and `private`)
- Getters and Setters
- Methods with parameters
- Methods with return values

---

# Technologies

- Java
- Object-Oriented Programming (OOP)

---

# Next Topics

- Constructors
- `this` keyword
- Method Overloading
- Advanced Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interfaces
