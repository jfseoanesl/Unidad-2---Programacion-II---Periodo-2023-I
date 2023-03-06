/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo F
 */
public class Maestro {
    private final double TARIFA=200;

    public Maestro() {
    }

    public double getTARIFA() {
        return TARIFA;
    }
    
    public double calcularPago(double mts){
        return this.TARIFA * mts;
    }
    
    public double calcularPago(Vivienda v){
        return this.calcularPago(v.getMtsContruccion());
    }
}
