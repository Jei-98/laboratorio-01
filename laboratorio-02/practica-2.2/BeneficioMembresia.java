public class BeneficioMembresia {

    public static void main(String[] args) {
        // Prueba las cuatro combinaciones cambiando estos dos valores:
        // (true, 250000) (true, 150000) (false, 250000) (false, 150000)
        boolean membresiaActiva = true;
        double totalCompra = 250000;

        if (membresiaActiva && totalCompra >= 200000) {
            System.out.println("Aplica beneficio.");
        } else {
            System.out.println("No aplica beneficio.");
        }
    }
}
