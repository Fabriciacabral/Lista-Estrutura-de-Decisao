import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Selecione a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado = 0.0;
        String operacao = "";

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                operacao = "soma";
                break;
            case 2:
                resultado = numero1 - numero2;
                operacao = "subtração";
                break;
            case 3:
                resultado = numero1 * numero2;
                operacao = "multiplicação";
                break;
            case 4:
                resultado = numero1 / numero2;
                operacao = "divisão";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O resultado da " + operacao + " é: " + resultado);
        if (resultado % 2 == 0) {
            System.out.println("O resultado é um número par.");
        } else {
            System.out.println("O resultado é um número ímpar.");
        }
        if (resultado >= 0) {
            System.out.println("O resultado é um número positivo.");
        } else {
            System.out.println("O resultado é um número negativo.");
        }
        if (Math.round(resultado) == resultado) {
            System.out.println("O resultado é um número inteiro.");
        } else {
            System.out.println("O resultado é um número decimal.");
        }
    }
}
