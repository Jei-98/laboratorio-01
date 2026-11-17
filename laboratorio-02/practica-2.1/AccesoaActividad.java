public class AccesoaActividad {
    public static void main(String[] args) {
        int edad = 19;
        boolean inscripcion = false;
        boolean documentopresentado =true;  

        boolean resultado1 = edad >= 18;
        boolean resultado2 = inscripcion && documentopresentado;
        boolean resultado3 = edad >= 18 && inscripcion && documentopresentado;
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);

    }
}
