/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.time.LocalDate;
import modelo.*;

/**
 *
 * @author Jairo F
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona personaA = new Persona();
        imprimirPersona(personaA);
        
        Direccion dir = new Direccion("Sabanas", "Valledupar", "Cesar");
        Empresa empresa = new Empresa(3456, "Andes");
        LocalDate fecha = LocalDate.of(2009, 6, 4);
        Persona personaB = new Persona("88", "COndorito", 30, fecha, dir, empresa);
        imprimirPersona(personaB);

        
    }
    
    public static void imprimirPersona(Persona p){
        System.out.println("Datos de la Persona");
        System.out.println(p);
        System.out.println("----------------------------");
    }
    
}
