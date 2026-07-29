package Construtores;

/*Um construtor parametrizado é um construtor que aceita um ou mais argumentos. 
Ele permite inicializar os campos do objeto com 
valores específicos fornecidos durante a criação do objeto.*/

class Car {
    String model;
    String color;
    int year;

    // Parameterized constructor
    public Car(String modelName, String carColor, int modelYear) {
        model = modelName;
        color = carColor;
        year = modelYear;
        System.out.println("Parameterized constructor called");
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model 3", "Red", 2023); // Calls the parameterized constructor
        myCar.displayDetails();
    }
}

/*
Neste exemplo:
A Carclasse possui um construtor parametrizado Car(String modelName, String carColor, int modelYear).
O construtor recebe três argumentos: modelName, carColor, e modelYear.
Dentro do construtor, esses argumentos são usados ​​para inicializar os campos model, color, 
e yeardo Carobjeto.
Quando new Car("Tesla Model 3", "Red", 2023)é chamado, o construtor parametrizado é executado e o 
objeto é inicializado com os valores fornecidos.
*/