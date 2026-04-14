import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    public LinkedList<Obj> LlamarLista(LinkedList<Obj> l, Scanner teclado){
        boolean pedir = true;
        while (pedir) {
            Obj o = new Obj();
            System.out.println("Ingrese el nombre del estudiante");
            o.setNombre(teclado.next());
            System.out.println("Ingrese el carnet");
            o.setCarnet(teclado.next());
            System.out.println("Ingrese la cedula");
            o.setCedula(teclado.nextInt());
            l.add(o);
            System.out.println("Desea seguir ingresando 1. Si, 2. No");
            int opt = teclado.nextInt();
            if (opt == 2) {
                pedir = false;
            }
        }

        return l;
    }

    public void MostrarLista(LinkedList<Obj> l){
        for (Obj o : l) {
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Carnet: " + o.getCarnet());
            System.out.println("Cedula: "+ o.getCedula());
            System.out.println("**********************************");
            System.out.println();
        }
    }
}
