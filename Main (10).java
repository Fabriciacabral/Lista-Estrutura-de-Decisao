import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Em que turno você estuda? Digite M para matutino, V para vespertino ou N para noturno: ");
        String turno = scanner.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }

        scanner.close();
    }
}
