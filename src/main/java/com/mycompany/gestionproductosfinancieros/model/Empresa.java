/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionproductosfinancieros.model;

/**
 *
 * @author Juan Camilo
 */
public class Empresa {

    private static Empresa instancia;

    private String nombre;
    private String nit;
    private String direccion;
    private String telefono;

    private Empresa() {
        nombre = "Gestión Productos Financieros";
        nit = "900123456-7";
        direccion = "Ibagué, Tolima";
        telefono = "3173350389";
    }

    public static Empresa getInstancia() {
        if (instancia == null) {
            instancia = new Empresa();
        }

        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
