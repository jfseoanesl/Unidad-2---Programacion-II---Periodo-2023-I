/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Jairo F
 */
public class Empresa {
    
    private String nit;
    private String nombre;
    private ArrayList<Direccion> direcciones;
    private ArrayList<Persona> trabajadores;

    public Empresa() {
        this("123ABC", "Bavaria.com");
        
    }

    public Empresa(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        this.direcciones = new ArrayList();
        this.trabajadores = new ArrayList();
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direcciones
     */
    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * @param direcciones the direcciones to set
     */
    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    /**
     * @return the trabajadores
     */
    public ArrayList<Persona> getTrabajadores() {
        return trabajadores;
    }

    /**
     * @param trabajadores the trabajadores to set
     */
    public void setTrabajadores(ArrayList<Persona> trabajadores) {
        this.trabajadores = trabajadores;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nit=" + nit + ", nombre=" + nombre  + '}';
    }
    
    public void registrarDireccion(Direccion d){
        this.direcciones.add(d);
    }
    
    public void registrarTrabajador(Persona p){
        this.trabajadores.add(p);
    }
    
}
