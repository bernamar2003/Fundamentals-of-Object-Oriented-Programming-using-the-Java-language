package Exercicios02;

public class Smartphone {
    

    // Atributos
    private String brand;
    private String model;
    private int battery;
    private boolean poweredOn;

    // Construtor
    public Smartphone(String brand, String model, int battery) {
        this.brand = brand;
        this.model = model;

        // Garante que a bateria fique entre 0 e 100
        if (battery < 0) {
            this.battery = 0;
        } else if (battery > 100) {
            this.battery = 100;
        } else {
            this.battery = battery;
        }

        this.poweredOn = false;
    }

    // Liga o smartphone
    public void turnOn() {
        if (poweredOn) {
            System.out.println("O smartphone já está ligado.");
        } else if (battery == 0) {
            System.out.println("Não é possível ligar. A bateria está descarregada.");
        } else {
            poweredOn = true;
            System.out.println("Smartphone ligado.");
        }
    }

    // Desliga o smartphone
    public void turnOff() {
        if (!poweredOn) {
            System.out.println("O smartphone já está desligado.");
        } else {
            poweredOn = false;
            System.out.println("Smartphone desligado.");
        }
    }

    // Carrega a bateria até o máximo de 100%
    public void chargeBattery() {
        if (battery == 100) {
            System.out.println("A bateria já está totalmente carregada.");
        } else {
            battery += 20;

            if (battery > 100) {
                battery = 100;
            }

            System.out.println("Bateria carregada. Nível atual: " + battery + "%");
        }
    }

    // Consome bateria
    public void useBattery(int percent) {
        if (!poweredOn) {
            System.out.println("Ligue o smartphone antes de utilizá-lo.");
            return;
        }

        if (percent <= 0) {
            System.out.println("O consumo deve ser maior que 0.");
            return;
        }

        battery -= percent;

        if (battery <= 0) {
            battery = 0;
            poweredOn = false;
            System.out.println("A bateria acabou. O smartphone foi desligado automaticamente.");
        } else {
            System.out.println("Foram consumidos " + percent + "% da bateria.");
        }
    }

    // Exibe o estado do smartphone
    public void showStatus() {
        System.out.println("\n===== STATUS DO SMARTPHONE =====");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Bateria: " + battery + "%");
        System.out.println("Ligado: " + (poweredOn ? "Sim" : "Não"));
        System.out.println("===============================\n");
    }
}

