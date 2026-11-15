public class DatosBasicosProducto {
    public static void main(String[] args) {

        // Variables del producto
        int codigo = 105;
        String nombre = "Mouse inalámbrico";
        String categoria = "A";
        double precio = 78000.0;
        int cantidad = 12;
        boolean activo = true;

        // Constante del impuesto
        final double IMPUESTO = 0.19;

        // Mostrar ficha del producto
        System.out.println("------------------------------");
        System.out.println("PRODUCTO");
        System.out.println("------------------------------");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Activo: " + activo);
        System.out.println("Impuesto: " + IMPUESTO);
    }
}

