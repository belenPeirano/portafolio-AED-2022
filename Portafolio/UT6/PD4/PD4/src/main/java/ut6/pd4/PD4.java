/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ut6.pd4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author belu_
 */
public class PD4 {

    public static void main(String[] args) {
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(".\\src\\main\\java\\ut6\\pd4\\libro.txt");
        corregirTexto(lineas);
        for (String s : diezPalabrasMasRepetidas(ocurrenciasPalabras(lineas))){
            System.out.println(s);
        }
    }

    public static void corregirTexto(String[] lineas) {
        for (int i = 0; i < lineas.length; i++) {
            String aux = lineas[i].toLowerCase().replace("-", " ");
            StringBuilder copyAux = new StringBuilder();
            for (char c : aux.toCharArray()) {
                if ((c >= 'a' && c <= 'z') || c == ' ') {
                    copyAux.append(c);
                }
            }
            lineas[i] = copyAux.toString();
        }
    }

    public static HashMap<String, Integer> ocurrenciasPalabras(String[] lineas) {
        HashMap<String, Integer> mapa = new HashMap<>();
        for (String str : lineas) {
            String[] linea = str.split(" ");
            for (String palabra : linea) {
                if (mapa.containsKey(palabra)) {
                    mapa.replace(palabra, mapa.get(palabra) + 1);
                } else {
                    mapa.put(palabra, 1);
                }
            }
        }
        return mapa;
    }

    private static int[] diezValoresMasRepetidos(HashMap<String, Integer> mapa) {
        
        HashMap<String,Integer> mapaTemp = new HashMap<>(mapa);
        int[] claves = new int[10];
        for (int i = 0; i < 10; i++) {
            Integer max = Collections.max(mapaTemp.values());
            mapaTemp.values().remove(Collections.max(mapaTemp.values()));
            claves[i] = max;
        }
        return claves;
    }
    
    public static String[] diezPalabrasMasRepetidas(HashMap<String,Integer> mapa){
        String[] palabras = new String[10];
        int[] diezValores = diezValoresMasRepetidos(mapa);
        
        for (int i = 0; i < 10; i++) {
            // Se utiliza mapa.entrySet() para poder recorrerlo con un foreach, ya que el hashmap como tal no se puede recorrer así
            for (var elemento : mapa.entrySet()) {
                if (Objects.equals(diezValores[i], elemento.getValue())) {
                    palabras[i] = elemento.getKey();
                }
            }
        }
        return palabras;
    }
}