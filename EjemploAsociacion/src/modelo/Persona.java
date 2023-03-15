/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Jairo F
 */
public class Persona {
    
    private String id;
    private String nombre;
    private int edad;
    private LocalDate fechaVinculacion;
    private Direccion domicilio;
    private Empresa empresa;

    public Persona() {
        this("77","Jairo Seoanes",25, LocalDate.now(),new Direccion(),new Empresa());
    }

    public Persona(String id, String nombre, int edad, LocalDate fechaVinculacion, Direccion domicilio, Empresa empresa) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaVinculacion = fechaVinculacion;
        this.domicilio = domicilio;
        this.empresa = empresa;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the fechaVinculacion
     */
    public LocalDate getFechaVinculacion() {
        return fechaVinculacion;
    }

    /**
     * @param fechaVinculacion the fechaVinculacion to set
     */
    public void setFechaVinculacion(LocalDate fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    /**
     * @return the domicilio
     */
    public Direccion getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", fechaVinculacion=" + fechaVinculacion + ", domicilio=" + domicilio + ", empresa=" + empresa + '}';
    }
    
    
}
