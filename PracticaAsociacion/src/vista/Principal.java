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
        
        Direccion dir = new Direccion("abc", "Paris", "Francia");
        Empresa emp = new Empresa("3456", "AWS");
        LocalDate fecha = LocalDate.of(2020, 1, 1);
        Persona personaB = new Persona(4567, "Jairo", dir, emp, fecha);
        imprimirPersona(personaB);
        
        emp.registrarTrabajador(personaB);
        emp.registrarTrabajador(personaA);
        emp.registrarDireccion(dir);
        imprimirEmpresa(emp);
        
    }
    
    public static void imprimirPersona(Persona p){
        System.out.println(p);
        System.out.println("------------------------------");
    }
    
    public static void imprimirEmpresa(Empresa e){
        
        System.out.println("Datos de la empresa: ");
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Nit: " + e.getNit());
        System.out.println("Direcciones: ");
        for(Direccion d : e.getDirecciones()){
            System.out.println(d);
        }
        System.out.println("Trabajadores: ");
        for(Persona p: e.getTrabajadores()){
            imprimirPersona(p);
        }
    
    }
    
}
