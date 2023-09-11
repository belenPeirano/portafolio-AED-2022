import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args){
        TArbolTrie trie = new TArbolTrie();

        // CARGAR EN EL TRIE LOS DISPOSITIVOS PARTIR DEL ARCHIVO DISPOSITIVOS.TXT
        for (String linea : ManejadorArchivosGenerico.leerArchivo("src/dispositivos.txt")) {
            String[] partes = linea.split(",");
            trie.insertar(new TDispositivo(partes[0], partes[1], null));
        }
        
        String[] lineas = new String[3];
        int i = 0;
        for (String linea : ManejadorArchivosGenerico.leerArchivo("src/subredes.txt")) {
            lineas[i] = linea;
            i++;
        }
        
        i = 0;
        LinkedList<TDispositivo> dispositivos = new LinkedList<TDispositivo>();
        for (String linea : lineas) {
            dispositivos.addAll(trie.buscarDispositivos(lineas[i]));
            i++;
        }
        
        
        // crear el archivo "salida.txt", con los dispositivos(1 por linea) 
        // correspondientes a la subred indicada
        // imprimir Nombre y dirección de  IP,
        
        lineas = new String[dispositivos.size()];
        Collections.sort(dispositivos);
        for (int j = 0; j < dispositivos.size(); j++) {
            TDispositivo line = dispositivos.get(j);
            lineas[j] = line.getDirIP() + "," + line.getNombre();
        }
        ManejadorArchivosGenerico.escribirArchivo("src/salida.txt", lineas);
        
        
    }
}