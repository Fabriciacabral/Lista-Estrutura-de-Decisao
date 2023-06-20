import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataString = scanner.nextLine();

        boolean dataValida = validarData(dataString);

        if (dataValida) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }

        scanner.close();
    }

    public static boolean validarData(String dataString) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Não permite datas inválidas, como 31/02/2023

        try {
            Date data = dateFormat.parse(dataString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
