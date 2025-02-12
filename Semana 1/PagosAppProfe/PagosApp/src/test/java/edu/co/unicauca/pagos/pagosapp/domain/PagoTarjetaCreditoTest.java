/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package edu.co.unicauca.pagos.pagosapp.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ahurtado
 */
public class PagoTarjetaCreditoTest {
    
    public PagoTarjetaCreditoTest() {
    }
    
    @Test
    public void createPagoTarjetaCredito() {
        PagoTarjetaCredito pago = new PagoTarjetaCredito("74645374645", 340000.0);
        assertEquals(pago.getNumero(),"74645374645");
        assertEquals(pago.getValor(),340000.0);
    }
    
    @Test
    public void validarPagoTarjetaCredito() {
        assertEquals(2,3);
    }
}
