/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo F
 */
public class Cuenta {
    
    private int numero;
    private double saldo;
    private String tipo;
    private Persona titular;
    private Banco banco;

    public Cuenta() {
    }

    public Cuenta(int numero, double saldo, String tipo, Persona titular, Banco banco) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        this.titular = titular;
        this.banco = banco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + ", titular=" + titular + ", banco=" + banco.getNombre() + '}';
    }
    
    
    
}
