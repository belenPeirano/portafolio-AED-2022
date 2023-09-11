/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut3.pd6;

/**
 *
 * @author belu_
 */
public class Empresa {
    
    private Lista<Sucursal> listaSucursales = new Lista<>();
    
    public void insertarSucursal(Sucursal sucursal) {
        Nodo<Sucursal> nodo = new Nodo(sucursal.getNombre(), sucursal);
        listaSucursales.insertar(nodo);
    }
    
    public Sucursal buscarSucursal(String nombreSucursal) {
        if (listaSucursales.esVacia()) {
            System.out.println("La lista es vacía");
            return null;
        } else {
            Nodo<Sucursal> actual = listaSucursales.getPrimero();
            while (actual.getSiguiente() != null) {
                if (actual.getEtiqueta().equals(nombreSucursal)) {
                    return actual.getDato();
                }
                actual = actual.getSiguiente();
            }
            System.out.println("No existe ningun elemento de la lista con ese nombre");
            return null;
        }
    }
    
    public boolean eliminarSucursal(String nombreSucursal) {
        return listaSucursales.eliminar(nombreSucursal);
    }
    
    public String listarSucursales() {
        if (listaSucursales.esVacia()) {
            return "La lista de Sucursales está vacía.";
        } else {
            return listaSucursales.imprimir();
        }
    }
    
    public int cantidadSucursales() {
        if (listaSucursales.esVacia()) {
            return 0;
        } else {
            int contador = 0;
            Nodo<Sucursal> actual = listaSucursales.getPrimero();
            while (actual != null) {
                actual = actual.getSiguiente();
                contador++;
            }
            return contador;
        }
    }
    
    public boolean directorioEsVacio() {
        return listaSucursales.esVacia();
    }
    
}
