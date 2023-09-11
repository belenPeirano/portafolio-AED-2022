/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
public class TArbolTrieTelefonosIT {
    
    public TArbolTrieTelefonosIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        TArbolTrieTelefonos trie = new TArbolTrieTelefonos();
        TAbonado abonado = new TAbonado("Maria Belén Peirano", "095789654");
        TAbonado abonado1 = new TAbonado("Lucas Torres", "965874123");
        TAbonado abonado2 = new TAbonado("Marcela Cagancha", "963854721");
        
        trie.insertar(abonado);
        trie.insertar(abonado1);
        trie.insertar(abonado2);
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
    public void testSomeMethod() {
    }
    
    @Test
    public void testInsertar() {
        for (int i = 0; i < 3; i++) {
            
        }   
    }
}