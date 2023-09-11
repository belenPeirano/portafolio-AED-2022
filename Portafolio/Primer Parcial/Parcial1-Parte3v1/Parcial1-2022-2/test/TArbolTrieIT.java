/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author belu_
 */
public class TArbolTrieIT {

    private static TArbolTrie trie = new TArbolTrie();

    public TArbolTrieIT() {
    }

    @BeforeClass
    public static void setUpClass() {
        TDispositivo disp1 = new TDispositivo("172.016.001.056", "Dispositivo 1", 1);
        TDispositivo disp2 = new TDispositivo("010.010.200.002", "Dispositivo 2", 2);
        TDispositivo disp3 = new TDispositivo("010.010.200.003", "Dispositivo 3", 3);
        TDispositivo disp4 = new TDispositivo("010.010.200.004", "Dispositivo 4", 4);
        trie.insertar(disp1);
        trie.insertar(disp2);
        trie.insertar(disp3);
        trie.insertar(disp4);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testBuscarIpOK() {
        String expected = "Dispositivo 1";
        LinkedList<TDispositivo> dispositivos = trie.buscarDispositivos("172.");
        
        assertEquals(dispositivos.getLast(),expected);
    }
    
    @Test
    public void testBuscarMascaraErronea() {
        LinkedList<TDispositivo> expected = null;
        assertEquals(trie.buscarDispositivos("17."),expected);
    }

}