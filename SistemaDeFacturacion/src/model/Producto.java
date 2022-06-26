/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GrupoSistemadeFacturacion
 */
public class Producto {
    
    private String nombre;
    private Float precioUnitario;
    private Float precioCompra;
    private Integer stock;
    
    private Inventario inventario;

    public Producto() {
    }

    public Producto(String nombre, Float precioCompra, Integer stock) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioCompra=" + precioCompra + ", stock=" + stock + '}';
    }
}
