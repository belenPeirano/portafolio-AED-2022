/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author belu_
 */
public class PD3 {

    public static void main(String[] args) {
        Nodo nodito1 = new Nodo(1,"Nodito1");
        Nodo nodito2 = new Nodo(2,"Nodito2");
        Nodo nodito3 = new Nodo(3,"Nodito3");
        
        Lista lista = new Lista();
        
        lista.insertar(nodito1);
        lista.insertar(nodito2);
        lista.insertar(nodito3);
        
        System.out.println(lista.buscar(2));
        System.out.println(lista.imprimir());
        System.out.println(lista.imprimir(","));
        System.out.println(lista.eliminar(2));
        System.out.println(lista.imprimir());

    }

}