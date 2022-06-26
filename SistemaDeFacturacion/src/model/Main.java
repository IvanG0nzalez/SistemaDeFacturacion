/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author GrupoSistemadeFacturacion
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa e = new Empresa("Lucho's Store S.A.", "014090240", 12, 30);
        Proveedor proveedor = new Proveedor("Proveedor de Lucho", "012491252");
        
        Cliente c = new Cliente("Elon","Musk", "0125029529");
        
        Empleado emp = new Empleado("Lionel", "Messi", "1235982309", e);
        Empleado emp2 = new Empleado("Juan", "Espinosa", "1232309");
        
        Inventario i = new Inventario(); 
        Producto p = new Producto("Papel", 12f, 60);
        Producto p2 = new Producto("Lapiz", 15f, 10);
        Producto p3 = new Producto("Cuaderno", 1f, 55);
        Producto p4 = new Producto("Libro", 17f, 40);
        Producto p5 = new Producto("calculadora", 18f, 30);

        FacturaVenta f = new FacturaVenta("23-06-2022", c);
        e.agregarfacturaventa(f);
        
        FacturaCompra facturaCompra = new FacturaCompra("17/08/2003", proveedor);
        Direccion d = new Direccion("Sauces", "03-45");
        Direccion dEmpresa = new Direccion("Argelia", "06-18");
        c.setDireccion(d);
        e.agregarFacturaCompra(facturaCompra);
        Detalle d3 = new Detalle(4, p2);
        Detalle d1 = new Detalle(6, f, p);
        Detalle d2 = new Detalle(2, f, p4);
        
//        facturaCompra.agregarDetalle(d3);
        f.agregarDetalle(d1);
        f.agregarDetalle(d2);
        
        
        
        
        e.agregarEmpleadoAEmpresa(emp);
        e.agregarCliente(c);
        e.agregarFacturaCompra(facturaCompra);
        e.agregarfacturaventa(f);
        
//        System.out.println(e.getEmpleadoList());
//        System.out.println(emp.getEmpresa());
//        System.out.println(e.getClienteList());
//        System.out.println(e.getFacturaCompraList());
//        System.out.println(e.getFacturaVentaList());

        System.out.println(p.getStock());
        System.out.println(p4.getStock());
        System.out.println(p2.getStock());
        
        f.disminuirInventario();
//        facturaCompra.aumentarInventario();
    }
    
}
