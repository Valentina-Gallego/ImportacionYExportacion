import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Importar {
    public LinkedList<Obj> ImportarArchivo() {
        String rutaArchivo = "Estudiantes.txt";
        LinkedList<Obj> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {//bufferreader, va a la raiz del proyecto, busca un archivo 
            String linea;
            Obj obj = null;
            while ((linea = br.readLine()) != null) {//lee la primer linea, siempre y cuando no sea nula
                if (linea.startsWith("Cedula:")) {//va a la lineay valida si el primer registro es cedula
                    if (obj != null) {
                        lista.add(obj);//crea el primer nodo
                    }
                    obj = new Obj();
                    obj.setCedula(Integer.parseInt(linea.substring(8)));//cuenta a partir de 8 caracteres, NOMBRE: VAL, a partir del espacio
                } else if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        obj.setNombre(linea.substring(8));
                    }
                }   else if (linea.startsWith("Carnet:")) {
                    if (obj != null) {
                        obj.setCarnet(linea.substring(8));//parsear
                        lista.add(obj);
                        obj = null;
                    }
                }
            }
            System.out.println("Archivo importado correcrtamente ");

        } catch (Exception e) {
            // TODO: handle exception
        }
        return lista;
    }

}
