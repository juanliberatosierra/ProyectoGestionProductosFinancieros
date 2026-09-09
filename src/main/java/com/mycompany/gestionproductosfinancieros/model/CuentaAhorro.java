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
public class CuentaAhorro extends ProductoFinanciero implements ICalculable {

    private double tasaInteres;
    private int numeroRetiros;

    public CuentaAhorro(int numeroCuenta, String titular,
            LocalDate fechaApertura, double saldo,
            double tasaInteres, int numeroRetiros) throws Exception {

        super(numeroCuenta, titular, fechaApertura, saldo);

        this.tasaInteres = tasaInteres;
        this.numeroRetiros = numeroRetiros;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public double calcularInteres() {
        return getSaldo() * tasaInteres / 100;
    }

    @Override
    public double calcularValorDeRetiro() {

        if (numeroRetiros >= 4) {
            return 2500;
        }

        return 0;
    }

    @Override
    public double calcularSaldoFinal() {
        double saldoFinal = getSaldo() + calcularInteres() - calcularValorDeRetiro();

        if (saldoFinal < 0) {
            return 0;
        }

        return saldoFinal;
    }
}
