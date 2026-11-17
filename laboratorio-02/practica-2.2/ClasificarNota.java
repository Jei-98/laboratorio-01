public class ClasificarNota {

    public static void main(String[] args) {
        double nota = 4.2; // Probado con 4.8, 4.2, 3.5 y 2.7

        // El orden importa: se empieza por la condición más exigente.
        // Si empezáramos con nota >= 3.0, un 4.8 también cumpliría esa
        // condición y mostraría "aprobatorio" sin llegar a las demás.
        if (nota >= 4.5) {
            System.out.println("Desempeño sobresaliente");
        } else if (nota >= 4.0) {
            System.out.println("Desempeño alto");
        } else if (nota >= 3.0) {
            System.out.println("Desempeño aprobatorio");
        } else {
            System.out.println("No aprobado");
        }
    }
}
