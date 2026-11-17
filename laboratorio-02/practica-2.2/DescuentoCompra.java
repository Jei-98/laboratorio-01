import java.util.Locale;
import java.util.Scanner;

public class DescuentoCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // para leer decimales con punto

        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Valor de la compra: ");
        double valor = scanner.nextDouble();

        int porcentaje;
        if (valor >= 500000) {
            porcentaje = 15;
        } else if (valor >= 250000) {
            porcentaje = 10;
        } else if (valor >= 100000) {
            porcentaje = 5;
        } else {
            porcentaje = 0;
        }

        double descuento = valor * porcentaje / 100;
        double total = valor - descuento;

        System.out.println();
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor original: $" + valor);
        System.out.println("Porcentaje aplicado: " + porcentaje + " %");
        System.out.println("Valor del descuento: $" + descuento);
        System.out.println("Total final: $" + total);

        scanner.close();
    }
}
