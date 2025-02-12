/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.co.unicauca.pagos.pagosapppropio;

import edu.co.unicauca.pagos.pagosapppropio.domain.IPago;

/**
 *
 * @author lopez
 */
public class SistemaVenta {
    IPago pagOption;
    
    public SistemaVenta(IPago Anoption){
        pagOption = Anoption;
    }
    
    public String realizarPago (String iden,double valor){
        if(pagOption.validar())
            pagOption.procesar();
           return pagOption.obtenerDetalle();
    }
}
