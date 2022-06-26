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

    private Inventario inventario;
    private List<Proveedor> proveedorList;
    private List<Direccion> direccionList;
    private List<Cliente> clienteList;
    private List<Empleado> empleadoList;
    private List<FacturaCompra> facturaCompraList;
    private List<FacturaVenta> facturaVentaList;
    
    public Empresa() {
        direccionList = new LinkedList<>();
        clienteList = new LinkedList<>();
        empleadoList = new LinkedList<>();
        facturaCompraList = new LinkedList<>();
        facturaVentaList = new LinkedList<>();
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
    
    public void agregarEmpleadoAEmpresa(Empleado empleado){
        this.empleadoList.add(new Empleado(empleado.getNombre(), empleado.getApellido(), empleado.getCedula()));
    }
    
    public void agregarCliente(Cliente cliente){
        this.clienteList.add(new Cliente(cliente.getNombre(), cliente.getApellido(), cliente.getCedula(), cliente.getDireccion()));
    }
    
    public void agregarfacturaventa(FacturaVenta facturaVenta){
        this.facturaVentaList.add(new FacturaVenta(facturaVenta.getFecha(), facturaVenta.getCliente()));
    }
    
    public void agregarFacturaCompra(FacturaCompra facturaCompra){
        this.facturaCompraList.add(new FacturaCompra(facturaCompra.getFecha(), facturaCompra.getProveedor()));
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

    public List<FacturaCompra> getFacturaCompraList() {
        return facturaCompraList;
    }

    public void setFacturaCompraList(List<FacturaCompra> facturaCompraList) {
        this.facturaCompraList = facturaCompraList;
    }

    public List<FacturaVenta> getFacturaVentaList() {
        return facturaVentaList;
    }

    public void setFacturaVentaList(List<FacturaVenta> facturaVentaList) {
        this.facturaVentaList = facturaVentaList;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", ruc=" + ruc + ", porcentajeIVA=" + porcentajeIVA + ", utilidad=" + utilidad + ", inventario=" + this.getInventario() + ", proveedorList=" + this.getProveedorList() + ", empleadoList=" + this.getEmpleadoList() + '}';
    }

    
}
