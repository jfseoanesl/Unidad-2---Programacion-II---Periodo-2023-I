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
    
    private int nit;
    private String nombre;
    private ArrayList<Direccion> direcciones;
    private ArrayList<Persona> trabajadores;

    public Empresa() {
        this(123456, "Manejar.com");
    }

    public Empresa(int nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        this.direcciones = new ArrayList();
        this.trabajadores= new ArrayList();
    }

    /**
     * @return the nit
     */
    public int getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(int nit) {
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
    
    public void registrarDireccion(Direccion d){
        
        this.direcciones.add(d);
    }

    @Override
    public String toString() {
        return "Empresa{" + "nit=" + nit + ", nombre=" + nombre + '}';
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
    
    public void registrarTrabajador(Persona p){
        this.trabajadores.add(p);
    }
    
    
}
