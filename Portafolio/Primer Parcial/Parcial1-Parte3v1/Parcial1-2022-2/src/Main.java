
import java.util.Collection;
import java.util.LinkedList;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolTrie trie = new TArbolTrie();

        // CARGAR EN EL TRIE LOS DISPOSITIVOS PARTIR DEL ARCHIVO DISPOSITIVOS.TXT
        String[] dispositivosAinsertar = ManejadorArchivosGenerico.leerArchivo(".\\src\\dispositivos.txt");
        for (String p : dispositivosAinsertar) {
            String[] elementos = p.split(",");
            TDispositivo dispositivo = new TDispositivo(elementos[0],elementos[1],p);
            trie.insertar(dispositivo);
        }

        String subRed = "172.016.002."; // utilizar el indicado en el archivo "subredes.txt"

        LinkedList<TDispositivo> dispositivos = trie.buscarDispositivos(subRed);
        
       // System.out.println(dispositivos.getFirst().getDirIP());
        
        ManejadorArchivosGenerico.escribirArchivo(".\\src\\salida.txt", dispositivos.toArray(new String[0]));

        // crear el archivo "salida.txt", con los dispositivos(1 por linea) 
        // correspondientes a la subred indicada
        // imprimir Nombre y dirección de  IP, 
        //ManejadorArchivosGenerico.escribirArchivo("./src/salida.txt",.....);
    }
}
