import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda às seguintes perguntas (S para Sim e N para Não):");

        System.out.print("Telefonou para a vítima? ");
        String resposta1 = scanner.nextLine();

        System.out.print("Esteve no local do crime? ");
        String resposta2 = scanner.nextLine();

        System.out.print("Mora perto da vítima? ");
        String resposta3 = scanner.nextLine();

        System.out.print("Devia para a vítima? ");
        String resposta4 = scanner.nextLine();

        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = scanner.nextLine();

        int contagemSim = 0;

        if (resposta1.equalsIgnoreCase("S")) {
            contagemSim++;
        }
        if (resposta2.equalsIgnoreCase("S")) {
            contagemSim++;
        }
        if (resposta3.equalsIgnoreCase("S")) {
            contagemSim++;
        }
        if (resposta4.equalsIgnoreCase("S")) {
            contagemSim++;
        }
        if (resposta5.equalsIgnoreCase("S")) {
            contagemSim++;
        }

        if (contagemSim == 2) {
            System.out.println("Você é classificado como Suspeito(a).");
        } else if (contagemSim >= 3 && contagemSim <= 4) {
            System.out.println("Você é classificado como Cúmplice.");
        } else if (contagemSim == 5) {
            System.out.println("Você é classificado como Assassino(a).");
        } else {
            System.out.println("Você é classificado como Inocente.");
        }
    }
}
