/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut1_pd10;

import java.util.Arrays;

/**
 *
 * @author belu_
 */
public class UT1_PD10 {

    public static void main(String[] args) {
        String[] string = {"Hola", "mundo", "de", "los", "algoritmos"};
        String[] string2 = {"Hola", "mundo", "de", "la", "informatica"};
        contadorPalabras palabrasEnComun = new contadorPalabras();
        System.out.println(Arrays.toString(palabrasEnComun.palabrasComunes(string, string2)));
    }
}
