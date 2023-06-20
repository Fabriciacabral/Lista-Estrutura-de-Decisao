import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        int litros = scanner.nextInt();

        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        String tipoCombustivel = scanner.next();

        double precoAlcool = 1.90;
        double precoGasolina = 2.50;
        double valorTotal;

        if (tipoCombustivel.equalsIgnoreCase("A")) {
            if (litros <= 20) {
                valorTotal = litros * (precoAlcool - (precoAlcool * 0.03));
            } else {
                valorTotal = litros * (precoAlcool - (precoAlcool * 0.05));
            }
        } else if (tipoCombustivel.equalsIgnoreCase("G")) {
            if (litros <= 20) {
                valorTotal = litros * (precoGasolina - (precoGasolina * 0.04));
            } else {
                valorTotal = litros * (precoGasolina - (precoGasolina * 0.06));
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            return; // Encerra o programa
        }

        System.out.println("Valor a ser pago: R$ " + valorTotal);
    }
}
