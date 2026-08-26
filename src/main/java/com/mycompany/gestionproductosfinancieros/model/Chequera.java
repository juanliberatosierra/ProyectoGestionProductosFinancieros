/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionproductosfinancieros.model;

/**
 *
 * @author Juan Camilo
 */
public class Chequera {

    private int numeroCheques;
    private String estado;

    public Chequera(int numeroCheques, String estado) {
        this.numeroCheques = numeroCheques;
        this.estado = estado;
    }

    public int getNumeroCheques() {
        return numeroCheques;
    }

    public void setNumeroCheques(int numeroCheques) {
        this.numeroCheques = numeroCheques;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
