/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.co.unicauca.pagos.pagosapppropio.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author lopez
 */
public class PagoTarjetaCreditoTest {
    
    public PagoTarjetaCreditoTest() {
    }
    
    @Test
    public void createPagoTarjetaCredito() {
        PagoTarjetaCredito pago = new PagoTarjetaCredito("74645374645", 340000.0);
        assertEquals(pago.getId(),"74645374645");
        assertEquals(pago.getValor(),340000.0);
    }
    
    /**
     * Test of validar method, of class PagoTarjetaCredito.
     */
    
    @ParameterizedTest
    @CsvSource({"1,1","1234567891011121,-3","12345678910,12"})
    public void validarPagoTarjetaCreditoNoValido(String idTar,float valor) {
        PagoTarjetaCredito pago = new PagoTarjetaCredito(idTar, valor);
        assertFalse(pago.validar());
    }
    
    @ParameterizedTest
    @CsvSource({"12345678910121416,1","12345678910131,1000"})
    public void validarPagoTarjetaCreditoValido(String idTar,float valor) {
        PagoTarjetaCredito pago = new PagoTarjetaCredito(idTar, valor);
        assertTrue(pago.validar());
    }
   
   
    /**
     * Test of procesar method, of class PagoTarjetaCredito.
     */
    @Test
    public void testProcesar() {
        System.out.println("procesar");
        PagoTarjetaCredito instance = null;
        instance.procesar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerDetalle method, of class PagoTarjetaCredito.
     */
    @Test
    public void testObtenerDetalle() {
        System.out.println("obtenerDetalle");
        PagoTarjetaCredito instance = null;
        String expResult = "";
        String result = instance.obtenerDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class PagoTarjetaCredito.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PagoTarjetaCredito instance = new PagoTarjetaCredito("",1);
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValor method, of class PagoTarjetaCredito.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        PagoTarjetaCredito instance = new PagoTarjetaCredito("", 0);
        double expResult = 0.0;
        double result = instance.getValor();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setId method, of class PagoTarjetaCredito.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "1";
        PagoTarjetaCredito instance = new PagoTarjetaCredito(id, 0);
        instance.setId(id);
        assertEquals(instance.getId(),id);
    }

    /**
     * Test of setValor method, of class PagoTarjetaCredito.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        double valor = 0.0;
        PagoTarjetaCredito instance = new PagoTarjetaCredito("1", 1.1);
        instance.setValor(valor);
        assertEquals(instance.getValor(),valor);
    }
    
}
