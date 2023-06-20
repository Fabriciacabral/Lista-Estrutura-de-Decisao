import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int maiorNumero = numero1;

        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }

        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
    }
}
