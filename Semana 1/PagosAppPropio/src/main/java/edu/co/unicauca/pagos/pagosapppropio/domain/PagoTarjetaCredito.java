/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.co.unicauca.pagos.pagosapppropio.domain;

/**
 *
 * @author lopez
 */
public class PagoTarjetaCredito implements IPago {

    private String id;
    private double valor;

    public PagoTarjetaCredito(String idTarjeta, double valorTrans) {
        id = idTarjeta;
        valor = valorTrans;
    }

  
  

    @Override
    public boolean validar() {
         return !(id.length() < 13 || id.length() > 19 || valor<=0);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void procesar() {
        if(validar()){
            System.out.println("Procesando pago con tarjeta de crédito " + id + " por: " + valor);
        }
        else{
            System.out.println("Número de tarjeta ó valor inválido");
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String obtenerDetalle() {
        return "Pago realizado con tarjeta de crédito - Monto:" + valor;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
