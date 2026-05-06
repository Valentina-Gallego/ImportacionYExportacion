import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    public LinkedList<Obj> LlamarLista(LinkedList<Obj> l, Scanner teclado, Metodos m) {
        boolean pedir = true;
        while (pedir) {
            Obj o = new Obj();
            System.out.println("Ingrese el nombre del estudiante");
            o.setNombre(teclado.next());
            System.out.println("Ingrese el carnet");
            o.setCarnet(teclado.next());
            System.out.println("Ingrese la cedula");
            int cedula = teclado.nextInt();
            while (m.ValidarCedula(l, cedula)) {
                System.out.println("La cedula ya existe por favor valide");
                cedula = teclado.nextInt();
                pedir = false;
                break;
            }
            if (!pedir) {
                break;
            }
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

    public void MostrarLista(LinkedList<Obj> l) {
        for (Obj o : l) {
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Carnet: " + o.getCarnet());
            System.out.println("Cedula: " + o.getCedula());
            System.out.println("**********************************");
            System.out.println();
        }
    }

    public Obj ConsultarEstudiante(int Cedula, LinkedList<Obj> l) {// devuelve un objeto
        Obj o = new Obj();
        for (Obj O : l) {
            if (o.getCedula() == Cedula) {
                o.setCedula(Cedula);
                o.setNombre(O.getNombre());
                o.setCarnet(O.getCarnet());
            } else {
                System.out.println("ESTUDIANTE NO ENCONTRADO");
            }
        }
        return o;
    }

    public LinkedList<Obj> ModificarEstudiante(int Cedula, LinkedList<Obj> l, Scanner teclado) {// devuelve una lista
        for (Obj O : l) {
            if (O.getCedula() == Cedula) {
                System.out.println("Ingrese el nuevo nombre");
                O.setNombre(teclado.next());
                System.out.println("Ingrese el nuevo carnet");
                O.setCarnet(teclado.next());
            } else {
                System.out.println("ESTUDIANTE NO ENCONTRADO");
            }
        }
        return l;
    }

    public LinkedList<Obj> EliminarEstudiante(int Cedula, LinkedList<Obj> l, Scanner teclado) {
        l.removeIf(x -> x.getCedula() == Cedula);
        return l;
    }

    public boolean ValidarCedula(LinkedList<Obj>l, int cedula){
        boolean encontro = false;
        for (Obj o : l) {
            if (o.getCedula() == cedula) {
                encontro = true;
            }else{
                encontro = false;
            }
        }
        return encontro;
    }
}
