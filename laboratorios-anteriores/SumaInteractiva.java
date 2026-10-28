import java.util.Scanner;

public class SumaInteractiva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número 1: ");
        int n1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int n2 = scanner.nextInt();

        int suma = n1 + n2;
        int resta = n1 - n2;
        int multiplicacion = n1 * n2;
        int division = n1 / n2;      // división entera
        int residuo = n1 % n2;       // residuo de la división

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);

        scanner.close();
    }
}
