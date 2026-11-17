public class CondicionesAnidadas {

    public static void main(String[] args) {
        int edad = 20;
        boolean tieneDocumento = true;

        // Versión 1: condiciones anidadas
        if (edad >= 18) {
            if (tieneDocumento) {
                System.out.println("Ingreso autorizado.");
            } else {
                System.out.println("Debe presentar documento.");
            }
        } else {
            System.out.println("No cumple la edad requerida.");
        }

        // Versión 2: la misma regla con &&
        if (edad >= 18 && tieneDocumento) {
            System.out.println("Ingreso autorizado.");
        } else {
            System.out.println("No cumple los requisitos.");
        }

        // Comparación: la anidada da mensajes más específicos (distingue si falla
        // la edad o el documento); la versión con && es más corta y clara cuando
        // basta con saber si cumple o no.
    }
}
