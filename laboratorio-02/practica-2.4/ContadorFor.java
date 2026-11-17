public class ContadorFor {

    public static void main(String[] args) {
        // Valor inicial: numero = 1 | Condición: numero <= 5 | Cambio: numero++
        for (int numero = 1; numero <= 5; numero++) {
            System.out.println(numero);
        }

        System.out.println("--- Cuenta regresiva ---");
        for (int numero = 10; numero >= 1; numero--) {
            System.out.println(numero);
        }
    }
}
