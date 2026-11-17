import java.util.Locale;
import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // notas con punto: 4.5

        System.out.print("Cantidad de notas: ");
        int cantidad = scanner.nextInt();

        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            suma = suma + nota;
        }

        if (cantidad > 0) {
            System.out.println("Promedio: " + (suma / cantidad));
        } else {
            System.out.println("No se registraron notas.");
        }

        scanner.close();
    }
}
