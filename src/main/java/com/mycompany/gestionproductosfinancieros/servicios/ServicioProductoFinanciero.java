/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionproductosfinancieros.servicios;

import com.mycompany.gestionproductosfinancieros.model.ProductoFinanciero;
import java.util.HashMap;
import java.util.Map;
import com.mycompany.gestionproductosfinancieros.gui.ICambiable;
import java.util.ArrayList;

/**
 *
 * @author Juan Camilo
 */
public class ServicioProductoFinanciero
        implements IServicioProductoFinanciero {

    private static ServicioProductoFinanciero instancia;

    private final Map<Integer, ProductoFinanciero> productos
            = new HashMap<>();

    private final ArrayList<ICambiable> guisProducto
            = new ArrayList<>();

    private ServicioProductoFinanciero() {
    }

    public static synchronized ServicioProductoFinanciero getInstancia() {

        if (instancia == null) {
            instancia = new ServicioProductoFinanciero();
        }

        return instancia;
    }

    public void addGUIProducto(ICambiable gui) {

        if (gui != null && !guisProducto.contains(gui)) {
            guisProducto.add(gui);
        }
    }

    public void delGUIProducto(ICambiable gui) {
        guisProducto.remove(gui);
    }

    @Override
    public void agregarProducto(ProductoFinanciero producto) {

        if (producto != null) {
            productos.put(
                    producto.getNumeroCuenta(),
                    producto
            );

            cambio();
        }
    }

    @Override
    public ProductoFinanciero buscarProducto(int numeroCuenta) {
        return productos.get(numeroCuenta);
    }

    @Override
    public void eliminarProducto(int numeroCuenta) {

        if (productos.containsKey(numeroCuenta)) {
            productos.remove(numeroCuenta);
            cambio();
        }
    }

    @Override
    public Map<Integer, ProductoFinanciero> listarProductos() {
        return Map.copyOf(productos);
    }

    public double calcularSaldoFinal(int numeroCuenta) {

        ProductoFinanciero producto =
                productos.get(numeroCuenta);

        if (producto != null) {
            return producto.calcularSaldoFinal();
        }

        return 0;
    }

    private void cambio() {

        for (ICambiable gui : guisProducto) {
            gui.cambio();
        }
    }
}