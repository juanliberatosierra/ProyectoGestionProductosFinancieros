/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionproductosfinancieros.servicios;

import com.mycompany.gestionproductosfinancieros.model.ProductoFinanciero;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan Camilo
 */
public class ServicioProductoFinanciero {

    private static Map<Integer, ProductoFinanciero> productos = new HashMap<>();

    public static Map<Integer, ProductoFinanciero> getProductos() {
        return Map.copyOf(productos);
    }

    public static void addProducto(ProductoFinanciero producto) {
        productos.put(producto.getNumeroCuenta(), producto);
    }

    public static void eliminarProducto(int numeroCuenta) {
        productos.remove(numeroCuenta);
    }

    public static double calcularSaldoFinal(int numeroCuenta) {

        ProductoFinanciero producto = productos.get(numeroCuenta);

        if (producto != null) {
            return producto.calcularSaldoFinal();
        }

        return 0;
    }
}
