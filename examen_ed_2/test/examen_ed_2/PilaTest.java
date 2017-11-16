/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_ed_2;

import examen_ed_2.Pila;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ecasado
 */
public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir() {
        System.out.println("no afegir cap plat");
        int el = 0;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.       
    }
    @Test
    public void testAfegir1() {
        System.out.println("afegir 2 plats");
        int el = 2;
        Pila instance = new Pila();
        int expResult = 2;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.       
    }
@Test
    public void testAfegir2() {
        System.out.println("afegir -1 plat");
        int el = -1;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.       
    }

@Test
    public void testAfegir3() {
        System.out.println("afegir 101 plat");
        int el = 101;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.       
    }
    /**
     * Test of totalElements method, of class Pila.
     */
    /**@Test
    public void testTotalElements() {
        System.out.println("totalElements");
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.totalElements();
        assertEquals(expResult, result);  
    }/

    /**
     * Test of treure method, of class Pila.
     */
    @Test
    public void testTreure() {
        System.out.println("treure quan no hi ha cap plat");
        Pila instance = new Pila();
        int expResult = -1;
        int result = instance.treure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testTreure1() {
        System.out.println("treure quan hi ha plats ");
        Pila instance = new Pila();
        instance.afegir(1);
        int expResult = 0;
        int result = instance.treure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
