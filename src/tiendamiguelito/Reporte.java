/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamiguelito;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author USER
 */
public class Reporte implements ProcedimientoVenta {
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    
    public Producto obtenerProducto(int n){
        Producto prod = listaProductos.get(n);
        return prod;
    }
    
    public int tamaño(){
        int tamaño = listaProductos.size();
        return tamaño;
    }
    
    @Override
    public void agregarProducto(Producto prod){
        listaProductos.add(prod);
    }
    
    @Override
    public void eliminarProducto(Producto prod) {
        Iterator<Producto> iterator = listaProductos.iterator();
        while (iterator.hasNext()) {
            Producto prodB = iterator.next();
            if (prodB == prod) {
                iterator.remove(); // Elimina el producto de manera segura
            }
        }
    }
    
    @Override
    public void mostrarProductos(JList<String> list_listaMostrando){
        list_listaMostrando.removeAll();
        
        DefaultListModel<String> listModel = new DefaultListModel<>();

        for (Producto producto : listaProductos) {
            listModel.addElement(producto.mostrarProducto()); 
        }
        
        list_listaMostrando.setModel(listModel);
    }
    
    @Override
    public double obtenerTotal(){
        double total = 0.0;
        for (Producto prod : listaProductos) {
            total += prod.getPrecio();
        }
        
        return total;
    }   
}
