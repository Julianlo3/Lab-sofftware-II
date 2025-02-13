/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.co.unicauca.pagos.pagosapppropio.domain;

/**
 *
 * @author lopez
 */
public class PagoTransferenciaBancaria implements IPago{

    private String remitente,numID,Banco,tipoCuenta,numCuenta;
    private double valor;

    public PagoTransferenciaBancaria(String remitente, String numID, String Banco, String tipoCuenta, String numCuenta, double valor) {
        this.remitente = remitente;
        this.numID = numID;
        this.Banco = Banco;
        this.tipoCuenta = tipoCuenta;
        this.numCuenta = numCuenta;
        this.valor = valor;
    }
    
    @Override
    public boolean validar() {
        return !(remitente.length()<3 || numID.length()<5 || Banco.length()<3 || tipoCuenta.length()<4 || numCuenta.length()<5 || valor<0);
    }

    @Override
    public void procesar() {
        if(validar()){
            System.out.println("Procesando sus datos para la transferencia bancaria...");
            System.out.println(
                    "Remitente:" + remitente + 
                    "\n # de identificacion:" + numID +
                    "\n Banco:" + Banco +
                    "\n Tipo de cuenta:" + tipoCuenta + "- #" + numCuenta +
                    "\n Por valor de: " + valor
            );
        }
        else{
            System.out.println("Error en los datos de la transferencia bancaria");
        }
    }

    @Override
    public String obtenerDetalle() {
        return "Remitente:" + remitente + 
                    "\n # de identificacion:" + numID +
                    "\n Banco:" + Banco +
                    "\n Tipo de cuenta:" + tipoCuenta + "- #" + numCuenta +
                    "\n Por valor de: " + valor;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
