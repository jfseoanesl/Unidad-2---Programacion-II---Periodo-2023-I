/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.*;

/**
 *
 * @author Jairo F
 */
public class EjemploMaestroObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vivienda v = new Vivienda(500);
        Maestro t = new Maestro();
        
        System.out.println("Pago : " + t.calcularPago(v));
        System.out.println("Pago: " + t.calcularPago(v.getMtsContruccion()));
    }
    
}
