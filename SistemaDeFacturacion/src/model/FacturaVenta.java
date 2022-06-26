/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GrupoSistemadeFacturacion
 */
public class FacturaVenta extends Factura{
    
    public FacturaVenta() {
    }

    public FacturaVenta(String fecha, Cliente cliente) {
        super(fecha, cliente);
    }
}
