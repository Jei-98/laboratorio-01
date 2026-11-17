public class TipoMetodo {

    public static void main(String[] args) {
        // Decisión de tipo para cada necesidad (antes de programar):
        // - mostrar un título              -> void   (solo imprime)
        // - calcular un subtotal           -> double (devuelve un valor)
        // - mostrar un menú                -> void
        // - calcular un descuento          -> double
        // - mostrar mensaje de despedida   -> void

        mostrarDespedida();
        System.out.println(calcularSubtotal(10000, 3));
    }

    static void mostrarDespedida() {
        System.out.println("¡Hasta pronto!");
    }

    static double calcularSubtotal(double precio, int cantidad) {
        return precio * cantidad;
    }
}
