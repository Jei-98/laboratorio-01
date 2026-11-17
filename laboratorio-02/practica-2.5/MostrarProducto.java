public class MostrarProducto {

    public static void main(String[] args) {
        mostrarProducto("Teclado", 85000);
        mostrarProducto("Mouse", 45000);
        mostrarProducto("Monitor", 650000);
    }

    static void mostrarProducto(String nombre, double precio) {
        System.out.println("Producto: " + nombre + " - Precio: $" + precio);
    }
}
