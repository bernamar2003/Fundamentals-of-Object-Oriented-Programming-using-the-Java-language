package Construtores;

/*
Encadeamento de construtores
O encadeamento de construtores é o processo de chamar um construtor 
a partir de outro construtor dentro da mesma classe. 
Isso é feito usando a this()palavra-chave. 
É útil para reutilizar código e garantir que a lógica de inicialização comum seja 
executada independentemente do construtor usado para criar o objeto.
*/

public class Phone {
    String model;
    String brand;
    int storage;

    // Constructor 1: Default constructor
    public Phone() {
        this("Unknown", "Unknown", 0); // Calls Constructor 2
        System.out.println("Default constructor called");
    }

    // Constructor 2: Parameterized constructor with model and brand
    public Phone(String model, String brand) {
        this(model, brand, 0); // Calls Constructor 3
        System.out.println("Parameterized constructor (model, brand) called");
    }

    // Constructor 3: Parameterized constructor with model, brand, and storage
    public Phone(String model, String brand, int storage) {
        this.model = model;
        this.brand = brand;
        this.storage = storage;
        System.out.println("Parameterized constructor (model, brand, storage) called");
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storage + " GB");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone(); // Calls Constructor 1 -> Constructor 2 -> Constructor 3
        phone1.displayDetails();

        Phone phone2 = new Phone("iPhone 13", "Apple"); // Calls Constructor 2 -> Constructor 3
        phone2.displayDetails();

        Phone phone3 = new Phone("Galaxy S21", "Samsung", 128); // Calls Constructor 3
        phone3.displayDetails();
    }
}

/*
Neste exemplo:

A Phone classe possui três construtores.
O construtor padrão Phone()chama o construtor parametrizado Phone(String model, 
String brand, int storage)usando this("Unknown", "Unknown", 0);.

O construtor Phone(String model, String brand)chama o construtor Phone(String model, 
String brand, int storage)usando this(model, brand, 0);.

Isso garante que a lógica de inicialização Phone(String model, String brand, int storage)
seja sempre executada, independentemente do construtor utilizado.
*/