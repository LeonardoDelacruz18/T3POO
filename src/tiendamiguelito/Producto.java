/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamiguelito;

/**
 *
 * @author USER
 */
public abstract class Producto {

    private String nombre;
    private int talla;
    private int precio;
    
    public Producto(){}
    
    public Producto(String nombre, int talla, int precio) {
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }   
    
    public String mostrarProducto(){
        return this.nombre;
    }
}
