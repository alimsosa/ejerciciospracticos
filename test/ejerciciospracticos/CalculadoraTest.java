/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estudiante.fit
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 1;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = 3;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 10;
        int b = 5;
        Calculadora instance = new Calculadora();
        int expResult = 5;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 2;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = 4;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testMultiplicarNegativo() {
        System.out.println("multiplicar");
        int a = -2;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = -4;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
    }
    
 
    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 12;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = 6;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);

    }

    
    @Test
    public void testDividirPor0() {
        System.out.println("dividir");
        int a = 19;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = -1;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);

    }
    
    
    
}
