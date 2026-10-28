import java.util.Scanner;

public class CotizadorCompraAmpliado {
    public static void main(String[] args) {

        // PLAN DEL PROGRAMA
        // 1. Leer datos del usuario
        // 2. Convertir porcentajes enteros a decimales
        // 3. Calcular subtotal
        // 4. Calcular descuento
        // 5. Calcular base después del descuento
        // 6. Calcular impuesto
        // 7. Sumar costo de envío
        // 8. Mostrar resumen completo

        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("     COTIZADOR JAVA PLUS");
        System.out.println("=============================");

        // Datos principales
        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Producto: ");
        String producto = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Descuento (%): ");
        int descuentoPorcentaje = scanner.nextInt();

        System.out.print("Impuesto (%): ");
        int impuestoPorcentaje = scanner.nextInt();

        System.out.print("Costo de envío: ");
        double costoEnvio = scanner.nextDouble();

        scanner.nextLine(); // limpiar salto de línea

        System.out.print("Nombre del vendedor: ");
        String vendedor = scanner.nextLine();

        System.out.print("Código de cotización: ");
        String codigoCotizacion = scanner.nextLine();

        // Conversión de porcentajes
        double descuentoDecimal = descuentoPorcentaje / 100.0;
        double impuestoDecimal = impuestoPorcentaje / 100.0;

        // Cálculos
        double subtotal = precioUnitario * cantidad;
        double valorDescuento = subtotal * descuentoDecimal;
        double base = subtotal - valorDescuento;
        double valorImpuesto = base * impuestoDecimal;
        double total = base + valorImpuesto + costoEnvio;

        // Salida final
        System.out.println("\n-----------------------------");
        System.out.println("RESUMEN DE COMPRA");
        System.out.println("-----------------------------");
        System.out.println("Código: " + codigoCotizacion);
        System.out.println("Cliente: " + cliente);
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Base: $" + base);
        System.out.println("Impuesto: $" + valorImpuesto);
        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("TOTAL FINAL: $" + total);

        scanner.close();
    }
}
