public class Operadores {
    public static void main(String[] args) {
    int edad = 17;
    boolean acompanado = true;

    boolean resultado1 = edad >= 18;
    boolean resultado2 = edad >= 18 || acompanado;
    boolean resultado3 = edad >= 18 && acompanado;
    boolean resultado4 = !acompanado;

    System.out.println(resultado1);
    System.out.println(resultado2);
    System.out.println(resultado3);
    System.out.println(resultado4);
}
}
