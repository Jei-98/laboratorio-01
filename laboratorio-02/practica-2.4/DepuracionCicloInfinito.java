public class DepuracionCicloInfinito {

    public static void main(String[] args) {
        // Variable de control: numero.
        // Error original: numero nunca cambiaba, así que la condición
        // (numero <= 5) nunca llegaba a ser falsa -> ciclo infinito.
        int numero = 1;

        while (numero <= 5) {
            System.out.println(numero);
            numero++; // corrección
        }
    }
}
