/*
Atributos: Encapsulamento de Dados
Idealmente, os atributos devem ser encapsulados , o que significa que
 seu acesso direto de fora da classe deve ser restrito. 
 Isso é conseguido usando modificadores de acesso como: Prite, protected e public.
  Por enquanto, vamos nos concentrar em `@` publice `@ private`.

public: Atributos declarados como public podem ser acessados ​​de qualquer lugar.
private: Atributos declarados como private só podem ser acessados ​​dentro da mesma classe.

*/
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setModel("Tesla Model 3");
        myCar.setSpeed(100);

        System.out.println("Model: " + myCar.getModel());
        System.out.println("Speed: " + myCar.getSpeed());
    }
}
class Car {
    private String model;
    private int speed;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed value.");
        }
    }

    public int getSpeed() {
        return speed;
    }
}



/*
Neste exemplo:
model é public, portanto pode ser acessado diretamente de Main.
speed é private, portanto, só pode ser acessado através dos métodos setSpeed()e getSpeed().
 Este é um exemplo de encapsulamento , que protege os dados e
  permite controlar como eles são acessados ​​e modificados.
   O setSpeed()método também demonstra a validação de dados, garantindo que
    a velocidade esteja dentro de um intervalo válido.
*/
