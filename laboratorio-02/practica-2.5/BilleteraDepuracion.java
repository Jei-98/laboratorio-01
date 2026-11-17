// Reto de depuración: errores que se pueden provocar en la billetera
// y cómo se corrigieron. (Prueba provocarlos tú en una copia de
// BilleteraConsola.java y comprueba el comportamiento.)
//
// 1. Condición incorrecta
//    Error:      if (valor > saldo) -> con "valor >= saldo" no deja gastar todo el saldo.
//    Causa:      el operador relacional equivocado deja fuera un caso válido.
//    Corrección: rechazar solo si valor > saldo.
//
// 2. Ciclo que no termina
//    Error:      while (opcion != 0) con opcion sin leerse de nuevo dentro del ciclo.
//    Causa:      la variable de control nunca cambia.
//    Corrección: leer opcion con scanner.nextInt() en cada iteración (o usar do while).
//
// 3. Switch que ejecuta una opción equivocada
//    Error:      case 1 -> saldo = registrarGasto(...);  case 2 -> saldo = registrarIngreso(...);
//    Causa:      los métodos quedaron asignados al case contrario.
//    Corrección: case 1 -> ingreso, case 2 -> gasto, como indica el menú.
//
// 4. Método que devuelve un saldo incorrecto
//    Error:      return saldo; después de sumar el ingreso (devuelve el saldo viejo).
//    Causa:      se calculó el nuevo valor pero se retornó la variable sin modificar.
//    Corrección: return saldo + valor;
public class BilleteraDepuracion {
    public static void main(String[] args) {
        System.out.println("Ver comentarios del archivo.");
    }
}
