import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        // Converter a letra para minúscula para facilitar a comparação
        letra = Character.toLowerCase(letra);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra digitada é uma vogal.");
        } else {
            System.out.println("A letra digitada é uma consoante.");
        }

        scanner.close();
    }
}
