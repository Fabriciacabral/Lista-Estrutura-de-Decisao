import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        int valorSaque = scanner.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque inválido.");
        } else {
            int[] notas = {100, 50, 10, 5, 1};
            int[] quantidadeNotas = new int[notas.length];

            int valorRestante = valorSaque;
            int indiceNota = 0;

            while (valorRestante != 0) {
                int quantidade = valorRestante / notas[indiceNota];
                quantidadeNotas[indiceNota] = quantidade;
                valorRestante %= notas[indiceNota];
                indiceNota++;
            }

            System.out.println("Notas fornecidas:");

            for (int i = 0; i < notas.length; i++) {
                if (quantidadeNotas[i] > 0) {
                    System.out.println(quantidadeNotas[i] + " nota(s) de " + notas[i] + " reais");
                }
            }
        }

        scanner.close();
    }
}
