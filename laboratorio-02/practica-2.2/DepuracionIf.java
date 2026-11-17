public class DepuracionIf {

    public static void main(String[] args) {
        int edad = 15;

        // Error original: "if (edad >= 18);" -> el punto y coma termina el if
        // con un cuerpo vacío, y el bloque { } siguiente se ejecuta siempre.
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
    }
}
