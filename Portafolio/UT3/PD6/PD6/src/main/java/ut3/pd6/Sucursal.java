/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut3.pd6;

/**
 *
 * @author belu_
 */
public class Sucursal implements ISucursal {

    private Comparable nombre;

    public Sucursal(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(Comparable nombre) {
        this.nombre = nombre;
    }

    public Comparable getNombre() {
        return nombre;
    }
}
