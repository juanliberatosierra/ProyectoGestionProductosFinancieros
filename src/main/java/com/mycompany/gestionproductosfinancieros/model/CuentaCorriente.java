/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionproductosfinancieros.model;

import java.time.LocalDate;

/**
 *
 * @author Karla Lizeth Lautero
 * @author Juan Camilo Liberato
 * @author Javier Carvajal
 */
public class CuentaCorriente extends ProductoFinanciero {

    private double cuotaManejo;
    private String tipoCuenta;
    private Chequera chequera;

    public CuentaCorriente(int numeroCuenta, String titular,
            LocalDate fechaApertura, double saldo,
            double cuotaManejo, String tipoCuenta) throws Exception {

        super(numeroCuenta, titular, fechaApertura, saldo);

        this.cuotaManejo = cuotaManejo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getCuotaManejo() {
        return cuotaManejo;
    }

    public void setCuotaManejo(double cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Chequera getChequera() {
        return chequera;
    }

    public void setChequera(Chequera chequera) {
        this.chequera = chequera;
    }

    @Override
    public double calcularSaldoFinal() {
        double saldoFinal = getSaldo() - cuotaManejo;

        if (saldoFinal < 0) {
            return 0;
        }

        return saldoFinal;
    }
}
