/*import java.util.LinkedList;
import java.util.Scanner;

public class Validaciones {
    public int ValidarEntero(Scanner sc){
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero numerico");
            sc.next();
        }
        return sc.nextInt();
    }

    public int ValidarRango(int n1, int n2, int opt, Scanner sc){
        Validaciones v = new Validaciones();
        while (opt < n1 || opt > n2) {
            System.out.println("Por favor ingrese un rango de: " + n1 + " y " + n2);
            opt = v.ValidarEntero(sc);
        }
        return opt;
    }

    public boolean ValidarCedula(int cedula, LinkedList<Obj> l){
        for (Obj o : l) {
            if (o.getCedula() == cedula) {
                return true;
            }
        }
        return false;
    }

    public boolean ValidarDimensionesNombre(String nombre){
        if (nombre.length() > 15) {
            System.out.println("El nombre no debe duperar 15 caracteres");
            return false;
        }else{
            return true;
        }
    }
}
*/
