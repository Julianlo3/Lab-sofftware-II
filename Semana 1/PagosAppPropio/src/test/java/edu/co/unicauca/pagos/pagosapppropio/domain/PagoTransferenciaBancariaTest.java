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
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

/**
 *
 * @author lopez
 */
public class PagoTransferenciaBancariaTest {

    public PagoTransferenciaBancariaTest() {
    }

   
    @Test
    public void createPagoTransBancaExitoso() {
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian", "1", "Nequi", "Ahorros", "317", 12);
        assertEquals(instance.getRemitente(), "Julian");
        assertEquals(instance.getNumID(), "1");
        assertEquals(instance.getBanco(), "Nequi");
        assertEquals(instance.getTipoCuenta(), "Ahorros");
        assertEquals(instance.getNumCuenta(), "317");
        assertEquals(instance.getValor(), 12);
    }

    /**
     * Test of validar method, of class PagoTransferenciaBancaria.
     *
     * @param remitente
     * @param numID
     * @param banco
     * @param tipoCuenta
     * @param numCuenta
     * @param valor
     */
    @ParameterizedTest
    @CsvSource({"Julian,123456,Nequi,Ahorros,31745,-1",
        "Julian,123456,Nequi,Ahorros,3174,2",
        "Julian,123456,Nequi,Aho,31745,2",
        "Julian,123456,Ne,Ahorros,31745,2",
        "Julian,1,Nequi,Ahorros,31745,2",
        "Ju,123456,Nequi,Ahorros,3174,2"})
    public void testValidarFallido(String remitente, String numID, String banco, String tipoCuenta, String numCuenta, double valor) {
        System.out.println("validar");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria(remitente, numID, banco, tipoCuenta, numCuenta, valor);
        boolean expResult = false;
        boolean result = instance.validar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidarExitoso(){
     PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        boolean expResult = true;
        boolean result = instance.validar();
        assertEquals(expResult, result);   
    }
    

    /**
     * Test of obtenerDetalle method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testObtenerDetalleExitoso() {
        System.out.println("obtenerDetalle");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        String expResult = "Remitente:" + instance.getRemitente() + 
                    "\n # de identificacion:" + instance.getNumID() +
                    "\n Banco:" + instance.getBanco() +
                    "\n Tipo de cuenta:" + instance.getTipoCuenta() + "- #" + instance.getNumCuenta() +
                    "\n Por valor de: " + instance.getValor();
        String result = instance.obtenerDetalle();
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerDetalleFallido() {
        System.out.println("obtenerDetalle");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        String expResult = "Remitente:" + instance.getRemitente() + 
                    "\n # de identificacion:" + instance.getNumID() +
                    "\n Banco:" + instance.getBanco() +
                    "\n Tipo de cuenta:" + instance.getTipoCuenta() + "- #" + instance.getNumCuenta() +
                    "\n Por valor de: " + (instance.getValor() -1);
        String result = instance.obtenerDetalle();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of getRemitente method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testGetRemitente() {
        System.out.println("getRemitente");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);;
        String expResult = "Julian";
        String result = instance.getRemitente();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRemitente method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testSetRemitente() {
        System.out.println("setRemitente");
        String remitente = "Pepe";
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        instance.setRemitente(remitente);
        assertEquals(remitente,instance.getRemitente());
    }

    /**
     * Test of getNumID method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testGetNumID() {
        System.out.println("getNumID");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        String expResult = "123456";
        String result = instance.getNumID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumID method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testSetNumID() {
        System.out.println("setNumID");
        String numID = "11111111";
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        instance.setNumID(numID);
        assertEquals(numID,instance.getNumID());
    }

    /**
     * Test of getBanco method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testGetBanco() {
        System.out.println("getBanco");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        String expResult = "Nequi";
        String result = instance.getBanco();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBanco method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testSetBanco() {
        System.out.println("setBanco");
        String Banco = "Daviplata";
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        instance.setBanco(Banco);
         assertEquals(Banco, instance.getBanco());
    }

    /**
     * Test of getTipoCuenta method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testGetTipoCuenta() {
        System.out.println("getTipoCuenta");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        String expResult = "Ahorros";
        String result = instance.getTipoCuenta();
        assertEquals(expResult,result);
    }

    /**
     * Test of setTipoCuenta method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testSetTipoCuenta() {
        System.out.println("setTipoCuenta");
        String tipoCuenta = "Corriente";
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        instance.setTipoCuenta(tipoCuenta);
        assertEquals(tipoCuenta,instance.getTipoCuenta());
    }

    /**
     * Test of getNumCuenta method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testGetNumCuenta() {
        System.out.println("getNumCuenta");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        String expResult = "31745";
        String result = instance.getNumCuenta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumCuenta method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testSetNumCuenta() {
        System.out.println("setNumCuenta");
        String numCuenta = "1111111";
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        instance.setNumCuenta(numCuenta);
        assertEquals(numCuenta,instance.getNumCuenta());
    }

    /**
     * Test of getValor method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        double expResult = 123;
        double result = instance.getValor();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setValor method, of class PagoTransferenciaBancaria.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        double valor = 1111;
        PagoTransferenciaBancaria instance = new PagoTransferenciaBancaria("Julian","123456","Nequi","Ahorros","31745",123);
        instance.setValor(valor);
        assertEquals(valor,instance.getValor());
    }
    
    
}
