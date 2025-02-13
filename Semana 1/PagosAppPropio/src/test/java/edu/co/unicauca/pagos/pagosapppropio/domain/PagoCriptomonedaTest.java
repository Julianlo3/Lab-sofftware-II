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
        PagoCriptomoneda instance = new PagoCriptomoneda("1","jkslcimush27dgr7smzft2ety");
        boolean expResult = false;
        boolean result = instance.validar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidarExitoso() {
        System.out.println("validar");
        PagoCriptomoneda instance = new PagoCriptomoneda("1","jkslcimush27dgr7smzis7ujzhs");
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
        PagoCriptomoneda instance = new PagoCriptomoneda("1","jkslcimush27dgr7smzis7ujzhs");
        String expResult = "Dirección de pago " + instance.getDireccion() + " con id: " + (instance.getIdCripto() +1);
        String result = instance.obtenerDetalle();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of getIdCripto method, of class PagoCriptomoneda.
     */
    @Test
    public void testGetIdCripto() {
        System.out.println("getIdCripto");
        PagoCriptomoneda instance = new PagoCriptomoneda("1","jkslcimush27dgr7smzis7ujzhs");
        String expResult = "1";
        String result = instance.getIdCripto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdCripto method, of class PagoCriptomoneda.
     */
    @Test
    public void testSetIdCripto() {
        System.out.println("setIdCripto");
        String idCripto = "2";
        PagoCriptomoneda instance = new PagoCriptomoneda("1","jkslcimush27dgr7smzis7ujzhs");
        instance.setIdCripto(idCripto);
        assertEquals(idCripto,instance.getIdCripto());
    }

    /**
     * Test of getDireccion method, of class PagoCriptomoneda.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        PagoCriptomoneda instance = new PagoCriptomoneda("1","jkslcimush27dgr7smzis7ujzhs");
        String expResult = "jkslcimush27dgr7smzis7ujzhs";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class PagoCriptomoneda.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "jkslcimush27dgr7smzis7ujzhs";
        PagoCriptomoneda instance = new PagoCriptomoneda("1","jkslcimush27dgr7smzis7ujzhs777");
        instance.setDireccion(direccion);
        assertEquals(direccion,instance.getDireccion());
    }
    
}
