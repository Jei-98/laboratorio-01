public class FacturaSimple {
    public static void main(String[] args) {

        // Datos del producto
        String nombreProducto = "Laptop Gamer";
        double precioUnitario = 100000.0;
        int cantidad = 2;
        double porcentajeDescuento = 0.10; // 10%

        // Cálculos
        double subtotal = precioUnitario * cantidad;
        double valorDescuento = subtotal * porcentajeDescuento;
        double total = subtotal - valorDescuento;

        // Mostrar resultados
        System.out.println("----- FACTURA SIMPLE -----");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Total a pagar: $" + total);
    }
}
