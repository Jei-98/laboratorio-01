import java.util.Locale;
import java.util.Scanner;

public class AcumuladorInteractivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double acumulado = 0;

        System.out.print("Valor: ");
        double valor = scanner.nextDouble();

        while (valor != 0) {
            acumulado = acumulado + valor;
            System.out.println("Acumulado: " + acumulado);
            System.out.println();
            System.out.print("Valor: ");
            valor = scanner.nextDouble();
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
