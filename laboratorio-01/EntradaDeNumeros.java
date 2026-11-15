import java.util.Scanner;

public class EntradaDeNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.println("Edad ingresada: " + edad);
        System.out.println("Cantidad ingresada: " + cantidad);
        System.out.println("Precio ingresado: " + precio);
    }
}
