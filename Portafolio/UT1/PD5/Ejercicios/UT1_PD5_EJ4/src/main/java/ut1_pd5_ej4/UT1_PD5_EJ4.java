/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ut1_pd5_ej4;

/**
 *
 * @author belu_
 */
public class UT1_PD5_EJ4 {

    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits "
                + "before decimal point.");
        System.out.println((s.length() - dot - 1)
                + " digits after decimal point.");
    }

}
