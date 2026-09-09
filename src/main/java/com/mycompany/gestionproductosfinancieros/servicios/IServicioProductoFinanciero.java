package com.mycompany.gestionproductosfinancieros.servicios;

import com.mycompany.gestionproductosfinancieros.model.ProductoFinanciero;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan Camilo
 */

public interface IServicioProductoFinanciero {

    void agregarProducto(ProductoFinanciero producto);

    ProductoFinanciero buscarProducto(int numeroCuenta);

    void eliminarProducto(int numeroCuenta);

    Map<Integer, ProductoFinanciero> listarProductos();
}