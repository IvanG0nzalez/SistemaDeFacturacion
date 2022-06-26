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
//        System.out.println(e);
        
        Cliente c = new Cliente("Elon","Musk", "0125029529");
//        System.out.println(c);
//        e.getClienteList().add(c);
        
        Empleado emp = new Empleado("Lionel", "Messi", "1235982309");
        Empleado emp2 = new Empleado("Juan", "Espinosa", "1232309");
        emp.setIdEmpleado("99876513");
        emp2.setIdEmpleado("1453332");
//        System.out.println(emp);
        
        e.getEmpleadoList().add(emp);
        e.getEmpleadoList().add(emp2);
//        System.out.println(e);
        
        
        Inventario i = new Inventario(); 
        Producto p = new Producto("Papel", 12f, 60);
        Producto p2 = new Producto("Lapiz", 15f, 10);
        Producto p3 = new Producto("Cuaderno", 1f, 55);
        Producto p4 = new Producto("Libro", 17f, 40);
        Producto p5 = new Producto("calculadora", 18f, 30);
        i.getProductoList().add(p);
        i.getProductoList().add(p2);
        i.getProductoList().add(p3);
        i.getProductoList().add(p4);
        i.getProductoList().add(p5);
        
        e.setInventario(i);
//        System.out.println(e);
//        System.out.println(i);

        Factura f = new Factura("23-06-2022", c);
        e.getFacturaList().add(f);
        f.setEmpresa(e);
//        System.out.println(f.getCliente());

        e.getProveedorList().add(proveedor);
//        System.out.println(e);
        
        Direccion d = new Direccion("Sauces", "03-45");
        Direccion dEmpresa = new Direccion("Argelia", "06-18");
        c.setDireccion(d);
//        System.out.println(c);
        
        e.getDireccionList().add(dEmpresa);
//        System.out.println(e.getDireccionList());
    }
    
}
