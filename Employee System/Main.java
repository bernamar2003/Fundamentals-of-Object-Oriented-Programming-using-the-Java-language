public class Main {

    static class Funcionario {
        private String nome;
        private String cargo;
        private double salario;

        public Funcionario(String nome, String cargo, double salario) {
            this.nome = nome;
            this.cargo = cargo;
            this.salario = salario;
        }

        public void aumentarSalario(double percentual) {
            this.salario += this.salario * percentual / 100;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Cargo: " + cargo);
            System.out.println("Salário: R$" + String.format("%.2f", salario));
        }
    }

    public static void main(String[] args) {

        // Criando dois funcionários
        Funcionario funcionario1 = new Funcionario(
                "João Pedro",
                "Desenvolvedor Java",
                350000
        );

        Funcionario funcionario2 = new Funcionario(
                "Maria Silva",
                "Analista de Sistemas",
                420000
        );

        System.out.println("=== Antes do aumento ===");
        funcionario1.exibirInformacoes();
        funcionario2.exibirInformacoes();

        // Aumentando o salário do primeiro funcionário
        funcionario1.aumentarSalario(10);

        System.out.println("=== Depois do aumento ===");
        funcionario1.exibirInformacoes();
        funcionario2.exibirInformacoes();
    }
}