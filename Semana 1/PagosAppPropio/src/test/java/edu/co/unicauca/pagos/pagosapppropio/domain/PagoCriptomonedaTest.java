package edu.co.unicauca.pagos.pagosapppropio.domain;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import edu.co.unicauca.pagos.pagosapppropio.domain.PagoCriptomoneda;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lopez
 */
public class PagoCriptomonedaTest {
    
    public PagoCriptomonedaTest() {
    }
    
    /**
     * Test of validar method, of class PagoCriptomoneda.
     */
    @Test
    public void testValidarFallido() {
        System.out.println("validar");
        PagoCriptomoneda instance = new PagoCriptomoneda("jkslcimush27dgr7smzft2ety",2);
        boolean expResult = false;
        boolean result = instance.validar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidarExitoso() {
        System.out.println("validar");
        PagoCriptomoneda instance = new PagoCriptomoneda("kslcimush27dgr7smzis7ujzhs",10);
        boolean expResult = true;
        boolean result = instance.validar();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of obtenerDetalle method, of class PagoCriptomoneda.
     */
    @Test
    public void testObtenerDetalleFallido() {
        System.out.println("obtenerDetalle");
        PagoCriptomoneda instance = new PagoCriptomoneda("jkslcimush27dgr7smzis7ujzhs",1);
        String expResult = "Dirección de pago " + instance.getDireccion() + " con valor: " + (instance.getValor()+1);
        String result = instance.obtenerDetalle();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of GetDireccion method, of class PagoCriptomoneda.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getIdCripto");
        PagoCriptomoneda instance = new PagoCriptomoneda("jkslcimush27dgr7smzis7ujzhs",23);
        String expResult = "jkslcimush27dgr7smzis7ujzhs";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdCripto method, of class PagoCriptomoneda.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String Direccion = "jkslcimush27dgr7smzis7ujzhss2";
        PagoCriptomoneda instance = new PagoCriptomoneda("jkslcimush27dgr7smzis7ujzhs",23);
        instance.setDireccion(Direccion);
        assertEquals(Direccion,instance.getDireccion());
    }


    


    /**
     * Test of getValor method, of class PagoCriptomoneda.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        PagoCriptomoneda instance = new PagoCriptomoneda("jkslcimush27dgr7smzis7ujzhs",23);
        double expResult = 23;
        double result = instance.getValor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValor method, of class PagoCriptomoneda.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        double valor = 45;
        PagoCriptomoneda instance = new PagoCriptomoneda("jkslcimush27dgr7smzis7ujzhs",23);
        instance.setValor(valor);
        assertEquals(valor, instance.getValor());
        
    }


}

