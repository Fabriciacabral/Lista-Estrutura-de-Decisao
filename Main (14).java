import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito;
        String status;

        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
            status = "APROVADO";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
            status = "APROVADO";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
            status = "APROVADO";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
            status = "REPROVADO";
        } else if (media >= 0 && media < 4.0) {
            conceito = "E";
            status = "REPROVADO";
        } else {
            conceito = "Conceito inválido";
            status = "Indefinido";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Status: " + status);

        scanner.close();
    }
}

