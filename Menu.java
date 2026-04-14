import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean seguir = true;
        LinkedList<Obj> Lista = new LinkedList<>();
        while (seguir) {
            System.out.println("***************************************************");
            System.out.println("***********WELCOME*****************");
            System.out.println("QUE DESEA REALIZAR?: ");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Consultar estudiante");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Mostrar estudiantes");
            System.out.println("6. Exportar");
            System.out.println("7. Importar");
            System.out.println("8. Salir");
            int opt = teclado.nextInt();

            switch (opt) {
                case 1:
                    Lista = m.LlamarLista(Lista, teclado);
                    break;
                case 2:
                    System.out.println("En mantenimiento");
                    break;
                case 3:
                    System.out.println("En mantenimiento");
                    break;

                case 4:
                    System.out.println("En mantenimiento");
                    break;
                case 5:
                    m.MostrarLista(Lista);
                    break;
                case 6:
                    Exportar e = new Exportar();
                    e.exportarArchivo(Lista);
                    break;
                case 7:
                    System.out.println("En mantenimiento");
                    break;
                case 8:
                    System.out.println("******HASTA LUEGO**************");
                    seguir = false;
                    break;
            
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        }
    }
}
