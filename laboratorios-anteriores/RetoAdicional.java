public class RetoAdicional {
    public static void main(String[] args) {

        // Datos del producto
        String nombreProducto = "Laptop Gamer";
        double precioUnitario = 100000.0;
        int cantidad = 2;
        double porcentajeDescuento = 0.10; // 10%

        // Reto adicional: impuesto
        double impuesto = 0.19; // 19%

        // Cálculos base
        double subtotal = precioUnitario * cantidad;
        double valorDescuento = subtotal * porcentajeDescuento;
        double baseDespuesDescuento = subtotal - valorDescuento;

        // Cálculo del impuesto
        double valorImpuesto = baseDespuesDescuento * impuesto;

        // Total final
        double totalFinal = baseDespuesDescuento + valorImpuesto;

        // Mostrar resultados
        System.out.println("----- FACTURA SIMPLE -----");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Base después del descuento: $" + baseDespuesDescuento);
        System.out.println("Impuesto (19%): $" + valorImpuesto);
        System.out.println("TOTAL FINAL: $" + totalFinal);
    }
}
