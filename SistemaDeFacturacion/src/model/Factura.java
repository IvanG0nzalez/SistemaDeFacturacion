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
public class Factura {
    
    private String numFactura;
    private Float subtotal = 0f;
    private Float total = 0f;
    private Float montoIVA = 0f;
    private String fecha;
    private String formaPago;
    private String numAutorizacion;
    private Integer porcentajeDescuento;
    private Float valorDescuento = 0f;
    
    private Empresa empresa;
    private Cliente cliente;
    private List<Detalle> detalleList;

    public Factura() {
        detalleList = new LinkedList<>();
    }

    public Factura(String fecha, Cliente cliente) {
        this();
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Factura(String fecha, Empresa empresa) {
        this();
        this.fecha = fecha;
        this.empresa = empresa;
    }
    
    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getMontoIVA() {
        return montoIVA;
    }

    public void setMontoIVA(Float montoIVA) {
        this.montoIVA = montoIVA;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getNumAutorizacion() {
        return numAutorizacion;
    }

    public void setNumAutorizacion(String numAutorizacion) {
        this.numAutorizacion = numAutorizacion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Detalle> getDetalleList() {
        return detalleList;
    }

    public void setDetalleList(List<Detalle> detalleList) {
        this.detalleList = detalleList;
    }

    public Integer getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Integer porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Float getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(Float valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    @Override
    public String toString() {
        return "Factura{" + "fecha=" + fecha + ", cliente=" + cliente + '}';
    }
}
