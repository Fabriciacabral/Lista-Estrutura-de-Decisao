import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (Math.round(numero) == numero) {
            System.out.println("O número " + numero + " é inteiro.");
        } else {
            System.out.println("O número " + numero + " é decimal.");
        }
    }
}
