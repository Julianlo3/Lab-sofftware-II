/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.co.unicauca.pagos.pagosapppropio.domain;

/**
 *
 * @author lopez
 */
public class PagoCriptomoneda implements IPago{

    private String idCripto;
    private String direccion;

    public PagoCriptomoneda(String idCripto, String direccion) {
        this.idCripto = idCripto;
        this.direccion = direccion;
    }
    
    @Override
    public boolean validar() {
        return (idCripto.length()>0 && direccion.length()>=26);
    }

    @Override
    public void procesar() {
        if(validar()){
            System.out.println("Procesando pago de criptos con dirección" + direccion);
        }
        else{
            System.out.println("Error al procesar el pago con cripto, dirección invalida");
        }
    }

    @Override
    public String obtenerDetalle() {
        return "Dirección de pago " + direccion + " con id: " +idCripto;
    }

    public String getIdCripto() {
        return idCripto;
    }

    public void setIdCripto(String idCripto) {
        this.idCripto = idCripto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
