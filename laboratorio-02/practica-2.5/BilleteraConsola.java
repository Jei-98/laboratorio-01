import java.util.Locale;
import java.util.Scanner;

public class BilleteraConsola {

    // Contadores y acumuladores (reto de ampliación)
    static int cantidadIngresos = 0;
    static int cantidadGastos = 0;
    static double totalIngresado = 0;
    static double totalGastado = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // decimales con punto

        System.out.print("Nombre del titular: ");
        String titular = scanner.nextLine();

        double saldo = 0;
        int opcion;

        do {
            mostrarMenu();

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> saldo = registrarIngreso(scanner, saldo);
                case 2 -> saldo = registrarGasto(scanner, saldo);
                case 3 -> mostrarSaldo(saldo);
                case 4 -> mostrarResumen(titular, saldo);
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("=========================");
        System.out.println("       MI BILLETERA");
        System.out.println("=========================");
        System.out.println("1. Registrar ingreso");
        System.out.println("2. Registrar gasto");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Mostrar resumen");
        System.out.println("0. Salir");
    }

    // Recibe el scanner y el saldo actual; devuelve el saldo actualizado.
    static double registrarIngreso(Scanner scanner, double saldo) {
        System.out.print("Valor del ingreso: ");
        double valor = scanner.nextDouble();

        if (valor <= 0) {
            System.out.println("El ingreso debe ser mayor que cero.");
            return saldo;
        }

        cantidadIngresos++;
        totalIngresado += valor;
        System.out.println("Ingreso registrado.");
        return saldo + valor;
    }

    // Recibe el scanner y el saldo actual; devuelve el saldo actualizado.
    static double registrarGasto(Scanner scanner, double saldo) {
        System.out.print("Valor del gasto: ");
        double valor = scanner.nextDouble();

        if (valor <= 0) {
            System.out.println("El gasto debe ser mayor que cero.");
            return saldo;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return saldo;
        }

        cantidadGastos++;
        totalGastado += valor;
        System.out.println("Gasto registrado.");
        return saldo - valor;
    }

    static void mostrarSaldo(double saldo) {
        System.out.println("Saldo actual: $" + saldo);
    }

    static void mostrarResumen(String titular, double saldo) {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Cantidad de ingresos: " + cantidadIngresos);
        System.out.println("Total ingresado: $" + totalIngresado);
        System.out.println("Cantidad de gastos: " + cantidadGastos);
        System.out.println("Total gastado: $" + totalGastado);
    }
}
