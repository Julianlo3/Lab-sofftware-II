/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.co.unicauca.pagos.pagosapppropio.domain;

/**
 *
 * @author lopez
 */
public interface IPago {
    public boolean validar();
    public void procesar();
    public String obtenerDetalle(); 
}
