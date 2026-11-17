import java.util.Scanner;

public class RepetirHastaCero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número (0 para terminar): ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            System.out.println("Escribió: " + numero);
            System.out.print("Número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
