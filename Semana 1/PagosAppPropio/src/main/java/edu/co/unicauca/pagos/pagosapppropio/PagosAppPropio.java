/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.co.unicauca.pagos.pagosapppropio;

import Mensajes.mensaje;
import edu.co.unicauca.pagos.pagosapppropio.domain.IPago;
import edu.co.unicauca.pagos.pagosapppropio.domain.PagoCriptomoneda;
import edu.co.unicauca.pagos.pagosapppropio.domain.PagoTarjetaCredito;
import edu.co.unicauca.pagos.pagosapppropio.domain.PagoTransferenciaBancaria;
import java.util.Scanner;

/**
 *
 * @author lopez
 */
public class PagosAppPropio {

     public static int obtenerOpcion(Scanner scanner) {
        while (!scanner.hasNextInt()) { 
            System.out.println("Error, ingrese nuevamente");
            scanner.next();  
            System.out.print("Ingrese una opción y pulse enter");
        }
        return scanner.nextInt();
     }
    
    
    
    public static void main(String[] args) {
        mensaje mensaje = new mensaje();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        //--- Creación de los metodos de pago 
        
        
        
        int opcionMenu;
        
        do {
            mensaje.mostrarMensajeBienvenida();
            opcionMenu = obtenerOpcion(scanner);

            switch (opcionMenu) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    System.out.println("\n \n ------ Pago con tarjeta ------");
                    System.out.println("Ingrese su # de tarjeta\n");
                    String numtarjeta = scanner1.nextLine();
                    System.out.println("Ingrese el valor a pagar");
                    double valor = scanner1.nextDouble();
                    IPago pagoTarjeta = new PagoTarjetaCredito(numtarjeta,valor);
                    SistemaVenta pago = new SistemaVenta(pagoTarjeta);
                    String resultado = pago.realizarPago(numtarjeta, valor);
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("\n \n ------ Pago con transferencia bancaria ------");
                    System.out.println("Ingrese su # de transferencia\n");
                    String numTrans = scanner1.nextLine();
                    System.out.println("Ingrese el valor a pagar");
                    double valorTrans = scanner1.nextDouble();
                    IPago pagoTans = new PagoTransferenciaBancaria(numTrans,valorTrans);
                    SistemaVenta pago2 = new SistemaVenta(pagoTans);
                    String resultado1 = pago2.realizarPago(numTrans, valorTrans);
                    System.out.println(resultado1);
                    break;
                case 3:
                    System.out.println("\n \n ------ Pago con criptos ------");
                    System.out.println("Ingrese la direccion\n");
                    String direccion = scanner1.nextLine();
                    System.out.println("Ingrese el valor");
                    Double valorCripto = scanner1.nextDouble();
                    IPago pagoCripto = new PagoCriptomoneda(direccion,valorCripto);
                    SistemaVenta pago3 = new SistemaVenta(pagoCripto);
                    String resultado2 = pago3.realizarPago(direccion, valorCripto);
                    System.out.println(resultado2);
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcionMenu != 0);

        scanner.close();
    }

}
   


