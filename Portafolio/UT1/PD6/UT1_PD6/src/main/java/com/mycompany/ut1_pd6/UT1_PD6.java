/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ut1_pd6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.PI;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author belu_
 */
public class UT1_PD6 {

    public static void imprimirTablero(int largo, int ancho) {
        for (int i = 0; i < largo; i++) {
            for (int h = 0; h < ancho; h++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void leerEntradaArchivo(String rutaArchivo) {
        FileReader fr;
        FileReader fr2;
        try {
            int cantidadLineas = 0;
            fr = new FileReader(rutaArchivo);
            fr2 = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null) {
                cantidadLineas++;
                lineaActual = br.readLine();
            }
            String[] lineas = new String[cantidadLineas];
            BufferedReader br2 = new BufferedReader(fr2);
            for (int i = 0; i < cantidadLineas; i++) {
                lineas[i] = br2.readLine();
            }
            System.out.println("El entero leído es: " + lineas[0]);
            System.out.println("El número de punto flotante es: " + lineas[1]);
            System.out.println("La cadena leída es " + lineas[2]);
            System.out.println("¡Hola " + lineas[2] + "! La suma de " + lineas[0] + " y " + lineas[1] + " es " + (Integer.valueOf(lineas[0]) + Float.valueOf(lineas[1])));
            System.out.println("La división entera de " + lineas[1] + " y " + lineas[0] + " es 2 y su resto es 9.44");

        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
            e.printStackTrace();
        }
    }

    public static void leerEntradaStdin() {
        int radio;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        radio = in.nextInt();

        System.out.println("El área de la circunferencia es: " + PI * (radio * radio) + " Y su perímetro es: " + PI * radio * 2);
    }

    public static void transformarTextoT9(String rutaArchivo) throws FileNotFoundException, IOException {
        FileReader fr;
        FileReader fr2;
        int cantidadLineas = 0;
        fr = new FileReader(rutaArchivo);
        fr2 = new FileReader(rutaArchivo);
        BufferedReader br = new BufferedReader(fr);
        String lineaActual = br.readLine();
        String texto = "";
        while (lineaActual != null) {
            cantidadLineas++;
            lineaActual = br.readLine();
        }
        String[] lineas = new String[cantidadLineas];
        BufferedReader br2 = new BufferedReader(fr2);
        for (int i = 0; i < cantidadLineas; i++) {
            //lineas[i] = br2.readLine();
            lineaActual = br2.readLine();
            for (int j = 0; j < lineaActual.length(); j++) {
                if (lineaActual.toUpperCase().charAt(j) == 'A' || lineaActual.toUpperCase().charAt(j) == 'B' || lineaActual.toUpperCase().charAt(j) == 'C') {
                    texto += "2";
                } else if (lineaActual.toUpperCase().charAt(j) == 'D' || lineaActual.toUpperCase().charAt(j) == 'E' || lineaActual.toUpperCase().charAt(j) == 'F') {
                    texto += "3";
                } else if (lineaActual.toUpperCase().charAt(j) == 'G' || lineaActual.toUpperCase().charAt(j) == 'H' || lineaActual.toUpperCase().charAt(j) == 'I') {
                    texto += "4";
                } else if (lineaActual.toUpperCase().charAt(j) == 'J' || lineaActual.toUpperCase().charAt(j) == 'K' || lineaActual.toUpperCase().charAt(j) == 'L') {
                    texto += "5";
                } else if (lineaActual.toUpperCase().charAt(j) == 'M' || lineaActual.toUpperCase().charAt(j) == 'N' || lineaActual.toUpperCase().charAt(j) == 'O') {
                    texto += "6";
                } else if (lineaActual.toUpperCase().charAt(j) == 'P' || lineaActual.toUpperCase().charAt(j) == 'Q' || lineaActual.toUpperCase().charAt(j) == 'R' || lineaActual.toUpperCase().charAt(j) == 'S') {
                    texto += "7";
                } else if (lineaActual.toUpperCase().charAt(j) == 'T' || lineaActual.toUpperCase().charAt(j) == 'U' || lineaActual.toUpperCase().charAt(j) == 'V') {
                    texto += "8";
                } else if (lineaActual.toUpperCase().charAt(j) == 'W' || lineaActual.toUpperCase().charAt(j) == 'X' || lineaActual.toUpperCase().charAt(j) == 'Y' || lineaActual.toUpperCase().charAt(j) == 'Z') {
                    texto += "9";
                } else if (lineaActual.toUpperCase().charAt(j) == '.') {
                    texto += 1;
                } else if (lineaActual.toUpperCase().charAt(j) == ' ') {
                    texto += 0;
                }
            }
        }
        BufferedWriter salida = new BufferedWriter(new FileWriter(".\\src\\main\\java\\com\\mycompany\\ut1_pd6\\salida.txt"));
        salida.write(texto);
        salida.close();
    }

    public static void main(String[] args) throws IOException {
        //imprimirTablero(7, 5);
        //leerEntradaArchivo(".\\src\\main\\java\\com\\mycompany\\ut1_pd6\\texto.txt");
        //leerEntradaStdin();
        transformarTextoT9(".\\src\\main\\java\\com\\mycompany\\ut1_pd6\\entrada.txt");
    }
}
