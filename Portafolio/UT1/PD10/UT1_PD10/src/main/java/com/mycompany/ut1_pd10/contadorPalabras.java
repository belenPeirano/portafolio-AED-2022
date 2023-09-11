/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut1_pd10;

/**
 *
 * @author belu_
 */
public class contadorPalabras {

    String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        String[] interseccion = new String[0];
        for (int i = 0; i < palabras1.length; i++) {
            for (int j = 0; j < palabras2.length; j++) {
                if (palabras1[i].equals(palabras2[j])){
                    String[] resultadoParcial = interseccion;
                    interseccion = new String[resultadoParcial.length + 1];
                    for (int m = 0; m < resultadoParcial.length;m++){
                        interseccion[m] = resultadoParcial[m];
                    }
                    interseccion[resultadoParcial.length] = palabras1[i];
                    
                }
            }
        }
        return interseccion;
    }
}
