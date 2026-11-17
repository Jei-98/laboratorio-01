public class Acumulador {

    public static void main(String[] args) {
        // Tabla de seguimiento (completada antes de ejecutar):
        // numero | suma
        // 1      | 1
        // 2      | 3
        // 3      | 6
        // 4      | 10
        // 5      | 15
        int suma = 0;

        for (int numero = 1; numero <= 5; numero++) {
            suma = suma + numero;
        }

        System.out.println("Suma: " + suma);
    }
}
