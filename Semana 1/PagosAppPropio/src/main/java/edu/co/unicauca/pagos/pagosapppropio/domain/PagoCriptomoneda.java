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

    private String direccion;
    private double valor;

    public PagoCriptomoneda(String direccion, double valor) {
        this.direccion = direccion;
        this.valor = valor;
    }
    
    @Override
    public boolean validar() {
        return (direccion.length()>=26 && valor>0);
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
        return "Dirección de pago " + direccion + " con valor: " + valor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
