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

/**
 *
 * @author lopez
 */
public class PagoTransferenciaBancariaTest {
    
    public PagoTransferenciaBancariaTest() {
    }
    
    /**
     * Test of validar method, of class PagoTransferenciaBancaria.
     * @param numCuenta
     * @param valor
     */
    @ParameterizedTest
    @CsvSource({"1,1","1234567891011121,-3","123456789,12","12345666666666666,12"})
    public void testValidarFallido(String numCuenta,double valor) {
        System.out.println("validar");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria(numCuenta,valor);
        boolean expResult = false;
        boolean result = instance.validar();
        assertEquals(expResult, result);
    }
    
      @ParameterizedTest
    @CsvSource({"1234567891012,1","12345678910123,1000"})
    public void testValidarExitoso(String numCuenta,double valor) {
        System.out.println("validar");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria(numCuenta,valor);
        boolean expResult = true;
        boolean result = instance.validar();
        assertEquals(expResult, result);
    }

  
    /**
     * Test of obtenerDetalle method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testObtenerDetalleFallido() {
        System.out.println("obtenerDetalle");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("1234567891012",1);
        String expResult = "Pago realizado con # " + instance.getNumeroCuenta() + " por un valor de: " + (instance.getValor()-1);
        String result = instance.obtenerDetalle();
        assertNotEquals(expResult, result);
    }
    
    @Test
    public void testObtenerDetalleExitoso() {
        System.out.println("obtenerDetalle");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("1234567891012",1);
        String expResult = "Pago realizado con # " + instance.getNumeroCuenta() + " por un valor de: " + (instance.getValor());
        String result = instance.obtenerDetalle();
        assertEquals(expResult, result);
    }
    
}
