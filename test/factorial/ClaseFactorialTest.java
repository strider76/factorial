/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manolo
 */
public class ClaseFactorialTest {
    
    public ClaseFactorialTest() {
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
     * Test of calculoSinFactorial method, of class ClaseFactorial.
     */
    @Test
    public void testCalculoSinFactorial() {
        System.out.println("TestFctorial:testCalculoSinFactorial()");
        assertEquals(24, ClaseFactorial.calculoSinFactorial(4));
        assertEquals(1, ClaseFactorial.calculoSinFactorial(1));
        assertEquals(-24, ClaseFactorial.calculoSinFactorial(-4));
    }

    /**
     * Test of calculoConFactorial method, of class ClaseFactorial.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testArgumentosMenoresUno (){
        System.out.println("TestFctorial:testArgumentosMenoresUno()");
        System.out.println("-4!=" + ClaseFactorial.calculoConFactorial(-4));
    }
    
    @Test()
    public void testCalculoConFactorial() {
        System.out.println("TestFctorial:testCalculoConFactorial()");
        assertEquals(24, ClaseFactorial.calculoConFactorial(4));
        assertEquals(1, ClaseFactorial.calculoConFactorial(1));
    }
    
}
