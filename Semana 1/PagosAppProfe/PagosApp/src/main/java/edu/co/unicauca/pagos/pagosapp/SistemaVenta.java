/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.co.unicauca.pagos.pagosapp;

import edu.co.unicauca.pagos.pagosapp.domain.IPago;

/**
 *
 * @author ahurtado
 */
public class SistemaVenta {
    IPago pagoOption;
    
    public SistemaVenta(IPago anOption){
        pagoOption = anOption;
    }
    
    public String realizarPago(String ident, double valor){
        if(pagoOption.validar())
              pagoOption.procesar();
        return pagoOption.obtenerDetalle();
    }
}
