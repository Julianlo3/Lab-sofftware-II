/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.unicauca.pagos.p.core;

import Mensajes.mensaje;
import co.edu.unicauca.pagos.p.common.IPago;
import co.edu.unicauca.pagos.p.plug.in.PagoCriptomoneda;
import co.edu.unicauca.pagos.p.plug.in.PagoTarjetaCredito;
import co.edu.unicauca.pagos.p.plug.in.PagoTransferenciaBancaria;
import java.util.Scanner;

/**
 *
 * @author Julián Rojas - Andrés Sandino
 */
public class PCore {

    public static int obtenerOpcion(Scanner scanner) {
        while (!scanner.hasNextInt()) { 
            System.out.println("Error, ingrese nuevamente");
            scanner.next();  
            System.out.print("Ingrese una opcion y pulse enter");
        }
        return scanner.nextInt();
     }
    
    
    public static void main(String[] args) {
        mensaje mensaje = new mensaje();
        Scanner scanner = new Scanner(System.in);
        
        int opcionMenu;
        
        do {
            mensaje.mostrarMensajeBienvenida();
            opcionMenu = obtenerOpcion(scanner);
            scanner.nextLine();

            switch (opcionMenu) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    System.out.println("\n \n ------ Pago con tarjeta ------");
                    System.out.println("Ingrese su # de tarjeta\n");
                    String numtarjeta = scanner.nextLine();
                    System.out.println("Ingrese el valor a pagar");
                    double valor = scanner.nextDouble();
                    IPago pagoTarjeta = new PagoTarjetaCredito(numtarjeta,valor);
                    SistemaVenta pago = new SistemaVenta(pagoTarjeta);
                    String resultado = pago.realizarPago(numtarjeta, valor);
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("\n \n ------ Pago con transferencia bancaria ------");
                    System.out.println("Ingrese su # de transferencia\n");
                    String numTrans = scanner.nextLine();
                    System.out.println("Ingrese el valor a pagar");
                    double valorTrans = scanner.nextDouble();
                    IPago pagoTans = new PagoTransferenciaBancaria(numTrans,valorTrans);
                    SistemaVenta pago2 = new SistemaVenta(pagoTans);
                    String resultado1 = pago2.realizarPago(numTrans, valorTrans);
                    System.out.println(resultado1);
                    break;
                case 3:
                    System.out.println("\n \n ------ Pago con criptos ------");
                    System.out.println("Ingrese la direccion\n");
                    String direccion = scanner.nextLine();
                    System.out.println("Ingrese el valor");
                    Double valorCripto = scanner.nextDouble();
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

