/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tiendamiguelito;

import javax.swing.JList;

/**
 *
 * @author USER
 */
public interface ProcedimientoVenta {    
    void agregarProducto(Producto prod);
    void eliminarProducto(Producto prod);
    void mostrarProductos(JList<String> list_listaMostrando);
    double obtenerTotal();
}