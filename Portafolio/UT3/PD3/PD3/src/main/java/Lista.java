/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author belu_
 */
public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        if (esVacia()) {
            primero = nodo;
        } else {
            INodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (esVacia()) {
            System.out.println("La lista es vacía");
            return null;
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                if (actual.getEtiqueta().equals(clave)) {
                    return actual;
                }
                actual = actual.getSiguiente();
            }
            System.out.println("No existe ningun elemento de la lista con esa clave");
            return null;
        }
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (buscar(clave) == null) {
            System.out.println("No se puede eliminar ese elemento porque no existe en la lista");
            return false;
        } else {
            INodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                if (actual.getSiguiente().getEtiqueta().equals(clave)) {
                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
                    return true;
                }
                actual = actual.getSiguiente();
            }
            return false;
        }
    }

    @Override
    public String imprimir() {
        INodo<T> actual = primero;
        String listaImpresa = "";
        while (actual.getSiguiente() != null) {
            listaImpresa += actual.getEtiqueta() + "\n";
            actual = actual.getSiguiente();
        }
        listaImpresa += actual.getEtiqueta();
        return listaImpresa;
    }

    @Override
    public String imprimir(String separador) {
        INodo<T> actual = primero;
        String listaImpresa = "";
        while (actual.getSiguiente() != null) {
            listaImpresa += actual.getEtiqueta() + separador;
            actual = actual.getSiguiente();
            if (actual.getSiguiente() == null) {
                listaImpresa += actual.getEtiqueta();
            }
        }
        return listaImpresa;
    }

    @Override
    public int cantElementos() {
        if (this.esVacia()) {
            return 0;
        }
        int contador = 0;
        Nodo<T> nodoActual = this.primero;
        while (nodoActual != null) {
            nodoActual = nodoActual.getSiguiente();
            contador++;
        }
        return contador; 
    }

    @Override
    public boolean esVacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }
}
