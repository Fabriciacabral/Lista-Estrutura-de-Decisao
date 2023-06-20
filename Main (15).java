import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o valor do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o valor do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if (verificarTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }

        scanner.close();
    }

    public static boolean verificarTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}
