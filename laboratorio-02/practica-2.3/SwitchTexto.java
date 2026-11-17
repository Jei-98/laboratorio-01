public class SwitchTexto {

    public static void main(String[] args) {
        String comando = "guardar";

        switch (comando) {
            case "guardar" -> System.out.println("Guardando...");
            case "buscar" -> System.out.println("Buscando...");
            case "salir" -> System.out.println("Saliendo...");
            default -> System.out.println("Comando desconocido.");
        }
    }
}
