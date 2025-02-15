/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.p.core;

import co.edu.unicauca.pagos.p.common.IPago;

/**
 *
 * @author lopez
 */
class SistemaVenta {
    IPago pagOption;
    
    public SistemaVenta(IPago Anoption){
        pagOption = Anoption;
    }
    
    public String realizarPago (String iden,double valor){
        if(pagOption.validar()){
            pagOption.procesar();
            return "Pago exitoso:" + pagOption.obtenerDetalle();
        }
           pagOption.procesar();
           return "Pago fallido con: " + pagOption.obtenerDetalle() ;
    }
}
