import java.util.Scanner;

public class MenuWhileDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Versión con while ===");
        int opcion = -1; // hay que inicializarla para que entre al ciclo
        while (opcion != 0) {
            System.out.println("1. Continuar");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
        }

        System.out.println("=== Versión con do while ===");
        do {
            System.out.println("1. Continuar");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
        } while (opcion != 0);

        // Comentario: do while me parece más natural para un menú porque este
        // debe mostrarse al menos una vez; no hace falta inicializar la opción
        // con un valor artificial como -1.

        scanner.close();
    }
}
