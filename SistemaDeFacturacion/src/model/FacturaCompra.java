/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GrupoSistemadeFacturacion
 */
public class FacturaCompra extends Factura {
   
    public FacturaCompra() {
    }

    public FacturaCompra(String fecha, Proveedor proveedor) {
        super(fecha, proveedor);
    }

    public void aumentarInventario(){
        for (Detalle detalle : detalleList) {
            int aux = detalle.getProducto().getStock() + detalle.getCantidad();
            detalle.getProducto().setStock(aux);
            System.out.println(detalle.getProducto().getStock());
        }
    }
}
