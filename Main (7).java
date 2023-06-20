import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        int maiorNumero = numero1;
        int menorNumero = numero1;

        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        } else if (numero2 < menorNumero) {
            menorNumero = numero2;
        }

        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        } else if (numero3 < menorNumero) {
            menorNumero = numero3;
        }

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);

        scanner.close();
    }
}
