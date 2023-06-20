import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra (F ou M): ");
        String letra = scanner.nextLine();

        if (letra.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else if (letra.equalsIgnoreCase("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }

        scanner.close();
    }
}
