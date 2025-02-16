/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.p.plug.in;

import co.edu.unicauca.pagos.p.common.IPago;

/**
 *
 * @author Julián Rojas - Andrés Sandino
 */
public class PagoTransferenciaBancaria implements IPago{

    private String numeroCuenta;
    private double valor;

    public PagoTransferenciaBancaria(String numeroCuenta, double valor) {
        this.numeroCuenta = numeroCuenta;
        this.valor = valor;
    }

    @Override
    public boolean validar() {
        return !(numeroCuenta.length()<10 || numeroCuenta.length()>14  || valor<0);
    }

    @Override
    public void procesar() {
        if(validar()){
            System.out.println("Procesando pago con transferencia bamcaria " + numeroCuenta + " por: " + valor);
        }
        else{
            System.out.println("Numero de tarjeta o valor invalido");
        }
    }

    @Override
    public String obtenerDetalle() {
        return "Pago realizado con # " + numeroCuenta + " por un valor de: " + valor;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

   

 
    
}
