package Exercicios02;

public class Main {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone("Samsung", "Galaxy S24", 50);

        phone.showStatus();

        phone.turnOn();
        phone.useBattery(15);
        phone.showStatus();

        phone.useBattery(40);
        phone.showStatus();

        phone.turnOn(); // Não liga porque a bateria acabou

        phone.chargeBattery();
        phone.chargeBattery();
        phone.chargeBattery();
        phone.chargeBattery();
        phone.chargeBattery();
        phone.chargeBattery(); // Não ultrapassa 100%

        phone.showStatus();

        phone.turnOn();
        phone.showStatus();

        phone.turnOff();
        phone.showStatus();
    }
}