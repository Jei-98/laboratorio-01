import java.util.Scanner;

public class DepuracionSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Opción (1, 2 o 3): ");
        int opcion = scanner.nextInt();

        // Sin default, al ingresar 9 el usuario no recibe ninguna respuesta:
        // el programa termina en silencio. Con default se le informa el error.
        switch (opcion) {
            case 1 -> System.out.println("Opción 1");
            case 2 -> System.out.println("Opción 2");
            case 3 -> System.out.println("Opción 3");
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
