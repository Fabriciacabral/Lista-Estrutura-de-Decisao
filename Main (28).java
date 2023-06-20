import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hipermercado Tabajara - Promoção de Carnes");
        System.out.println("==========================================");

        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        System.out.print("Digite o número correspondente ao tipo de carne desejado: ");
        int tipoCarne = scanner.nextInt();

        System.out.print("Digite a quantidade de carne em Kg: ");
        double quantidade = scanner.nextDouble();

        double precoKg;
        String nomeCarne;

        switch (tipoCarne) {
            case 1:
                nomeCarne = "File Duplo";
                if (quantidade <= 5) {
                    precoKg = 4.90;
                } else {
                    precoKg = 5.80;
                }
                break;
            case 2:
                nomeCarne = "Alcatra";
                if (quantidade <= 5) {
                    precoKg = 5.90;
                } else {
                    precoKg = 6.80;
                }
                break;
            case 3:
                nomeCarne = "Picanha";
                if (quantidade <= 5) {
                    precoKg = 6.90;
                } else {
                    precoKg = 7.80;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("==========================================");
        System.out.println("Cupom Fiscal");
        System.out.println("------------------------------------------");
        System.out.println("Tipo de carne: " + nomeCarne);
        System.out.println("Quantidade: " + quantidade + " Kg");
        double precoTotal = quantidade * precoKg;
        System.out.println("Preço total: R$ " + precoTotal);

        System.out.print("Forma de pagamento (1 - Dinheiro / 2 - Cartão Tabajara): ");
        int formaPagamento = scanner.nextInt();

        double desconto = 0.0;
        String tipoPagamento;

        if (formaPagamento == 2) {
            desconto = precoTotal * 0.05;
            tipoPagamento = "Cartão Tabajara";
        } else {
            tipoPagamento = "Dinheiro";
        }

        double valorAPagar = precoTotal - desconto;

        System.out.println("------------------------------------------");
        System.out.println("Tipo de pagamento: " + tipoPagamento);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor a pagar: R$ " + valorAPagar);
        System.out.println("==========================================");
    }
}
