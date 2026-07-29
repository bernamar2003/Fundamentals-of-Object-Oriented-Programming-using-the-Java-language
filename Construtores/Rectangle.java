package Construtores;

/*
Exercícios
Criar uma Rectangle classe:

Inclua campos para length e width.
Crie um construtor padrão que defina ambos os valores length como width 1.0.
Crie um construtor parametrizado que receba length e width como argumentos.
Adicione um método para calcular a área do retângulo.
Teste ambos os construtores no main método.
*/

public class Rectangle {
    double length;
    double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
        System.out.println("Default Rectangle constructor called");
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Parameterized Rectangle constructor called");
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Testing default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Area of rect1: " + rect1.calculateArea());

        // Testing parameterized constructor
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        System.out.println("Area of rect2: " + rect2.calculateArea());
    }
}