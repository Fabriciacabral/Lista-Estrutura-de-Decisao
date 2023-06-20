import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
        } else {
            System.out.print("Digite o valor de b: ");
            double b = scanner.nextDouble();

            System.out.print("Digite o valor de c: ");
            double c = scanner.nextDouble();

            double delta = calcularDelta(a, b, c);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("A equação possui uma raiz real: " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
            }
        }

        scanner.close();
    }

    public static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}
