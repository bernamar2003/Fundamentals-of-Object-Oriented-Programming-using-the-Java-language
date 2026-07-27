public class Main {

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