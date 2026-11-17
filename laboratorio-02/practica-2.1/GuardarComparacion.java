public class GuardarComparacion {

    public static void main(String[] args) {
        double nota = 3.8;
        boolean aprobo = nota >= 3.0;
        System.out.println(aprobo);

        double saldo = 120000;
        double compra = 150000;
        boolean puedeComprar = saldo >= compra;
        System.out.println(puedeComprar); // false

        // Cambiando los valores para obtener el otro resultado posible
        saldo = 200000;
        puedeComprar = saldo >= compra;
        System.out.println(puedeComprar); // true
    }
}
