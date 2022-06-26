/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author GrupoSistemadeFacturacion
 */
public class Empresa {

    private String nombre;
    private String ruc;
    private Integer porcentajeIVA;
    private Integer utilidad;
    private String telefono;
    private String correo;
    private Boolean isProveedor;

    private Inventario inventario;
    private List<Proveedor> proveedorList;
    private List<Direccion> direccionList;
    private List<Cliente> clienteList;
    private List<Empleado> empleadoList;
    private List<Factura> facturaList;

    public Empresa() {
        direccionList = new LinkedList<>();
        clienteList = new LinkedList<>();
        empleadoList = new LinkedList<>();
        facturaList = new LinkedList<>();
        proveedorList = new LinkedList<>();
    }

    public Empresa(String nombre, String ruc) {
        this();
        this.nombre = nombre;
        this.ruc = ruc;
    }

    public Empresa(String nombre, String ruc, Integer porcentajeIVA, Integer utilidad) {
        this(nombre, ruc);
        this.porcentajeIVA = porcentajeIVA;
        this.utilidad = utilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Integer getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void setPorcentajeIVA(Integer porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }

    public Integer getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(Integer utilidad) {
        this.utilidad = utilidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Direccion> getDireccionList() {
        return direccionList;
    }

    public void setDireccionList(List<Direccion> direccionList) {
        this.direccionList = direccionList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public List<Proveedor> getProveedorList() {
        return proveedorList;
    }

    public void setProveedorList(List<Proveedor> proveedorList) {
        this.proveedorList = proveedorList;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", ruc=" + ruc + ", porcentajeIVA="
                + porcentajeIVA + ", utilidad=" + utilidad + ", empleado=" + this.getEmpleadoList()
                + ", inventario=" + this.getInventario() + "proovedor=" + this.getProveedorList() + '}';
    }
}
