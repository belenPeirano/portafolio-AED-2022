
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolTrieTelefonos trieAbonados = new TArbolTrieTelefonos();

        // CARGAR EN EL TRIE LOS TELÉFONOS Y NOMBRES A PARTIR DEL ARCHIVO ABONADOS.TXT
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(".\\src\\abonados.txt");
        for (String linea : lineas) {
            String[] lineaActual = linea.split(",");
            TAbonado abonado = new TAbonado(lineaActual[1], lineaActual[0]);
            trieAbonados.insertar(abonado);
        }

        String[] codigos = ManejadorArchivosGenerico.leerArchivo(".\\src\\codigos1.txt");
        String[] lineaPais = codigos[0].split(" ");
        String[] lineaArea = codigos[1].split(" ");
        String pais = lineaPais[2];
        String area = lineaArea[2];

        LinkedList<TAbonado> ab = trieAbonados.buscarTelefonos(pais, area);
        LinkedList<String> salida = new LinkedList<String>();
        for (TAbonado abonadito : ab) {
            salida.add(abonadito.getNombre() + ", " + abonadito.getTelefono());
        }

        ManejadorArchivosGenerico.escribirArchivo(".\\src\\salida.txt", salida.toArray(new String[0]));
    }
}