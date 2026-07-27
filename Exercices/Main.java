package Exercices;
// Classe Rectangle

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        // Definindo largura e altura
        rectangle.setWidth(8.0);
        rectangle.setHeight(5.0);

        // Exibindo resultados
        System.out.println("Área: " + rectangle.getArea());
        System.out.println("Perímetro: " + rectangle.getPerimeter());
    }
}
class Rectangle {

    private double width;
    private double height;

    // Setter para largura
    public void setWidth(double width) {
        this.width = width;
    }

    // Setter para altura
    public void setHeight(double height) {
        this.height = height;
    }

    // Retorna a área
    public double getArea() {
        return width * height;
    }

    // Retorna o perímetro
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

