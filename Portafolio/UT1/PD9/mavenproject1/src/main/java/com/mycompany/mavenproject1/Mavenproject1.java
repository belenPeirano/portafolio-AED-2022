/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author belu_
 */
public class Mavenproject1 {

    public static int factorial(int num) {
        int resultado = 1;
        if (num < 0) {
            System.out.println("No existe el factorial de un número negativo");
            return -1;
        } else {
            for (int i = num; i >= 1; i--) {
                resultado *= i;
            }
        }
        return resultado;
    }

    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return ((n % 2 != 0 && prime && n > 2) || n == 2);
    }

    public static void main(String[] args) {
        int numero = 45769;
        int i = 0;
        int suma = 0;
        System.out.println(isPrime(numero));
        if (isPrime(numero)) {
            while (i <= numero) {
                suma += i;
                i += 2;
            }
        } else {
            i = 1;
            while (i <= numero) {
                suma += i;
                i += 2;
            }
        }
        System.out.println("Suma de " + numero + " es: " + suma);

    }
}
