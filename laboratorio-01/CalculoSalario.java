public class CalculoSalario {
    public static void main(String[] args) {

        // Datos del trabajador
        String nombre = "Carlos Pérez";
        int horasTrabajadas = 40;
        double valorHora = 15000.0;

        // Cálculo del pago
        double pago = horasTrabajadas * valorHora;

        // Constante del aporte (4%)
        final double APORTE = 0.04;

        // Cálculo del aporte
        double valorAporte = pago * APORTE;

        // Resumen
        System.out.println("----- RESUMEN DE PAGO -----");
        System.out.println("Trabajador: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: $" + valorHora);
        System.out.println("Pago total: $" + pago);
        System.out.println("Aporte (4%): $" + valorAporte);
    }
}
