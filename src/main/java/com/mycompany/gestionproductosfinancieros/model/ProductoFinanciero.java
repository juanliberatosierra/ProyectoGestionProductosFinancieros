/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionproductosfinancieros.model;

import java.time.LocalDate;

/**
 *
 * @author Juan Camilo
 */
public abstract class ProductoFinanciero {

    private int numeroCuenta;
    private String titular;
    private LocalDate fechaApertura;
    private double saldo;

    public ProductoFinanciero(int numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }

    public ProductoFinanciero(int numeroCuenta, String titular,
            LocalDate fechaApertura, double saldo) throws Exception {

        this(numeroCuenta, titular);
        this.fechaApertura = fechaApertura;
        setSaldo(saldo);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws Exception {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new Exception("El saldo no puede ser negativo");
        }
    }

    public double calcularSaldoFinal() {
        return saldo;
    }
}
