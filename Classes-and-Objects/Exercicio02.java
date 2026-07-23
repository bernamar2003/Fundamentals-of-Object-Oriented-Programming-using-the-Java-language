/*
Métodos: Implementação de Comportamento:
Os métodos contêm a lógica que define o comportamento dos objetos. 
Eles podem receber parâmetros (entrada) e retornar valores (saída).
*/
public class Exercicio02 {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        myRectangle.setDimensions(5, 10);
        int area = myRectangle.calculateArea();
        System.out.println("Rectangle area: " + area); // Output: Rectangle area: 50
    }
}

class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }
}


