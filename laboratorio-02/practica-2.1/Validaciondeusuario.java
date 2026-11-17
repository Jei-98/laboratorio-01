public class Validaciondeusuario {
    public static void main(String[] args) {

        String usuarioRegistrado = "aprendiz";
        String usuarioIngresado = "Aprendiz";

        System.out.println(usuarioRegistrado.equals(usuarioIngresado));           // false
        System.out.println(usuarioRegistrado.equalsIgnoreCase(usuarioIngresado)); // true

        // Diferencia observada: equals distingue mayúsculas y minúsculas
        // ("aprendiz" != "Aprendiz"); equalsIgnoreCase las ignora.
    }
}
