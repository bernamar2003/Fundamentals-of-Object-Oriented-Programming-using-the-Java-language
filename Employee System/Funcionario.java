public class Funcionario {

    // Atributos privados (Encapsulamento)
    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    // Método para aumentar o salário
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * percentual / 100;
        }
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: %.2f Kz%n", salario);
        System.out.println("----------------------------");
    }
}