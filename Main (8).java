import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double precoProduto1 = scanner.nextDouble();

        System.out.print("Digite o preço do segundo produto: ");
        double precoProduto2 = scanner.nextDouble();

        System.out.print("Digite o preço do terceiro produto: ");
        double precoProduto3 = scanner.nextDouble();

        if (precoProduto1 < precoProduto2 && precoProduto1 < precoProduto3) {
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (precoProduto2 < precoProduto1 && precoProduto2 < precoProduto3) {
            System.out.println("Você deve comprar o segundo produto.");
        } else if (precoProduto3 < precoProduto1 && precoProduto3 < precoProduto2) {
            System.out.println("Você deve comprar o terceiro produto.");
        } else {
            System.out.println("Há dois ou mais produtos com o mesmo preço mais baixo. Você pode escolher qualquer um deles.");
        }

        scanner.close();
    }
}
