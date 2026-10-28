public class ConversionTiempo {
    public static void main(String[] args) {

        int totalMinutos = 367;

        int horas = totalMinutos / 60;      // horas completas
        int minutosRestantes = totalMinutos % 60; // minutos sobrantes

        System.out.println("Total minutos: " + totalMinutos);
        System.out.println("Horas completas: " + horas);
        System.out.println("Minutos restantes: " + minutosRestantes);
    }
}
