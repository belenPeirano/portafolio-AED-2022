/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Casales
 */
public class TArbolTrieTest {

    @Test
    public void testInsertarValido() {
        TArbolTrie arbolTest = new TArbolTrie();

        TDispositivo uno = new TDispositivo("123.123.123.123", "1", null);
        arbolTest.insertar(uno);
        LinkedList<TDispositivo> dispositivos = arbolTest.buscarDispositivos("123.");
        
        assertEquals(1, dispositivos.size());
    }
    
    @Test
    public void testInsertarNoValido() {
        TArbolTrie arbolTest = new TArbolTrie();

        TDispositivo uno = new TDispositivo("123.123.123.123.1233", "1", null);
        arbolTest.insertar(uno);
        LinkedList<TDispositivo> dispositivos = arbolTest.buscarDispositivos("123.");
        
        assertEquals(0, dispositivos.size());
    }

    @Test
    public void testBuscarValido() {
        TArbolTrie ab = new TArbolTrie();

        TDispositivo uno = new TDispositivo("123.123.123.121", "1", null);
        TDispositivo dos = new TDispositivo("123.123.123.122", "2", null);
        TDispositivo tres = new TDispositivo("123.123.123.123", "3", null);
        ab.insertar(uno);
        ab.insertar(tres);
        ab.insertar(dos);

        LinkedList<TDispositivo> dispositivos = ab.buscarDispositivos("123.");

        assertEquals(3, dispositivos.size());
    }
    
    @Test
    public void testBuscarNoValido() {
        TArbolTrie ab = new TArbolTrie();

        TDispositivo uno = new TDispositivo("123.123.123.121", "1", null);
        TDispositivo dos = new TDispositivo("123.123.123.122", "2", null);
        TDispositivo tres = new TDispositivo("123.123.123.123", "3", null);
        ab.insertar(uno);
        ab.insertar(tres);
        ab.insertar(dos);

        LinkedList<TDispositivo> dispositivos = ab.buscarDispositivos("123");

        assertEquals(0, dispositivos.size());
    }

}
