import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero >= 1000) {
            System.out.println("Número inválido. Digite um número menor que 1000.");
        } else {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = (numero % 100) % 10;

            String resultado = "";

            if (centenas > 0) {
                resultado += centenas + " centena";
                if (centenas > 1) {
                    resultado += "s";
                }
            }

            if (dezenas > 0) {
                if (!resultado.isEmpty()) {
                    resultado += ", ";
                }
                resultado += dezenas + " dezena";
                if (dezenas > 1) {
                    resultado += "s";
                }
            }

            if (unidades > 0) {
                if (!resultado.isEmpty()) {
                    resultado += ", ";
                }
                resultado += unidades + " unidade";
                if (unidades > 1) {
                    resultado += "s";
                }
            }

            System.out.println(resultado);
        }

        scanner.close();
    }
}
