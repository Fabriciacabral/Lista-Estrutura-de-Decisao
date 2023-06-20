import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: ");
        double salarioAtual = scanner.nextDouble();

        double percentualAumento;
        double valorAumento;
        double novoSalario;

        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        valorAumento = salarioAtual * (percentualAumento / 100);
        novoSalario = salarioAtual + valorAumento;

        System.out.println("Salário antes do reajuste: R$" + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$" + valorAumento);
        System.out.println("Novo salário após o aumento: R$" + novoSalario);

        scanner.close();
    }
}
