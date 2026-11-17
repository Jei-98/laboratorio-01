public class Depuracion_encuentra_errores {

    public static void main(String[] args) {
        int edad = 20;
        boolean activo = true;

        // Error 1: "edad = 18" era una asignación (=), no una comparación.
        // Para "mayor de edad" lo correcto es edad >= 18.
        boolean mayorEdad = edad >= 18;

        // Error 2: "&" no es el operador lógico habitual; se usa && para "y".
        boolean habilitado = edad >= 18 && activo;

        System.out.println(mayorEdad);
        System.out.println(habilitado);
    }
}
