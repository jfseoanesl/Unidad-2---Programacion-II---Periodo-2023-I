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
    
    private int id;
    private String nombre;
    private Direccion domicilio;
    private Empresa empresa;
    private LocalDate fechaVinculacion;

    public Persona() {
                
        this(123456, "Condorito", new Direccion(), new Empresa(), LocalDate.now());
    }

    public Persona(int id, String nombre, Direccion domicilio, Empresa empresa, LocalDate fechaVinculacion) {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.empresa = empresa;
        this.fechaVinculacion = fechaVinculacion;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", domicilio=" + domicilio + ", empresa=" + empresa + ", fechaVinculacion=" + fechaVinculacion + '}';
    }
    
    
}
