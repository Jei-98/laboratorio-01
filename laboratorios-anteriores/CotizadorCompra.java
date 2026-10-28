import java.util.Scanner;

public class CotizadorCompra {
    public static void main(String[] args) {

        // PLAN DEL PROGRAMA
        // 1. Leer datos del usuario (cliente, producto, precio, cantidad, descuento, impuesto)
        // 2. Convertir porcentajes enteros a proporciones decimales
        // 3. Calcular el subtotal (precio * cantidad)
        // 4. Calcular el valor del descuento
        // 5. Calcular la base después del descuento
        // 6. Calcular el valor del impuesto (sobre la base)
        // 7. Calcular el total final (base + impuesto)
        // 8. Mostrar un resumen ordenado con todos los datos y cálculos

        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("       COTIZADOR JAVA");
        System.out.println("=============================");

        // 1. Leer datos del usuario
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

        // 2. Convertir porcentajes enteros a decimales
        double descuentoDecimal = descuentoPorcentaje / 100.0;
        double impuestoDecimal = impuestoPorcentaje / 100.0;

        // 3. Calcular subtotal
        double subtotal = precioUnitario * cantidad;

        // 4. Calcular valor del descuento
        double valorDescuento = subtotal * descuentoDecimal;

        // 5. Calcular base después del descuento
        double base = subtotal - valorDescuento;

        // 6. Calcular valor del impuesto (sobre la base)
        double valorImpuesto = base * impuestoDecimal;

        // 7. Calcular total final
        double total = base + valorImpuesto;

        // 8. Mostrar resumen ordenado
        System.out.println("\n-----------------------------");
        System.out.println("RESUMEN DE COMPRA");
        System.out.println("-----------------------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Base: $" + base);
        System.out.println("Impuesto: $" + valorImpuesto);
        System.out.println("TOTAL: $" + total);

        scanner.close();
    }
}
