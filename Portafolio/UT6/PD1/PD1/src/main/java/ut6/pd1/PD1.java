/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ut6.pd1;

import java.util.*;

/**
 *
 * @author belu_
 */
public class PD1 {

    private static final int REPETICIONES = 20;

    public static void main(String[] args) {
        TArbolTrie trie = new TArbolTrie();
        TArbolTrieHashMap triehashMap = new TArbolTrieHashMap();
        
        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo(".\\src\\main\\java\\ut6\\pd1\\listado-general_desordenado.txt");
        String[] palabrasBuscar = ManejadorArchivosGenerico.leerArchivo(".\\src\\main\\java\\ut6\\pd1\\listado-general_palabrasBuscar.txt");
        
        for (String p : palabrasclave) {
            trie.insertar(p);
            triehashMap.insertar(p);
        }

        Medible[] medibles = new Medible[2];
        int i = 0;
        medibles[i++] = new MedicionBuscarTrie(trie);
        medibles[i++] = new MedicionBuscarTrieHashMap(triehashMap);
        Medicion mi;
        i = 0;
        Object[] params = {REPETICIONES, palabrasBuscar};
        String[] lineas = new String[3];
        lineas[i++] = "algoritmo,tiempo,memoria";
        for (Medible m : medibles) {
            mi = m.medir(params);
            mi.print();
            lineas[i++] = mi.getTexto() + "," + mi.getTiempoEjecucion().toString() + "," + mi.getMemoria().toString();

        }

        ManejadorArchivosGenerico.escribirArchivo("./src/salida.csv", lineas);
    }
}