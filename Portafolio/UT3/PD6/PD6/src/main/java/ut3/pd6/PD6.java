/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ut3.pd6;

/**
 *
 * @author belu_
 */
public class PD6 {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Sucursal sucursal;

        String[] sucursales = ManejadorArchivosGenerico.leerArchivo(".\\src\\main\\java\\ut3\\pd6\\sucursales.txt");

        for (int i = 0; i < sucursales.length; i++) {
            sucursal = new Sucursal(sucursales[i]);
            empresa.insertarSucursal(sucursal);
        }
        

        System.out.println("La cantidad de sucursales es: " + empresa.cantidadSucursales());
        System.out.println(empresa.listarSucursales());
    }
}
