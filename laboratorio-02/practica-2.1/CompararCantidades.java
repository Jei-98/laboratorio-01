public class CompararCantidades {

    public static void main(String[] args) {
        int inventario = 12;
        int cantidadSolicitada = 8;

        boolean hayInventarioSuficiente = inventario >= cantidadSolicitada;
        boolean cantidadIgualInventario = cantidadSolicitada == inventario;
        boolean cantidadSuperaInventario = cantidadSolicitada > inventario;

        System.out.println("¿Hay inventario suficiente? " + hayInventarioSuficiente);
        System.out.println("¿Es exactamente igual al inventario? " + cantidadIgualInventario);
        System.out.println("¿Supera el inventario? " + cantidadSuperaInventario);
    }
}
