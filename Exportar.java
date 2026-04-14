
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {
    public void exportarArchivo(LinkedList<Obj> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("Estudiantes.txt")) {//filewriter: permite insertar en un txt los registros
                for (Obj obj : lista) {
                    e.write("Cedula: " + obj.getCedula() + "\n");//escribirlo en el txt
                    e.write("Nombre: " + obj.getNombre() + "\n");
                    e.write("Carnet: " + obj.getCarnet() + "\n");
                    e.write("------------------------------------------------------ \n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
