/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamiguelito;

/**
 *
 * @author USER
 */
public class Camisa extends Producto{
   
    public Camisa() {
        
    }   
    
    public Camisa(int talla) {
        if(talla == 16){        
            this.setNombre("Camisa");
            this.setPrecio(15);
            this.setTalla(16);
        }
        if(talla == 18){        
            this.setNombre("Camisa");
            this.setPrecio(18);
            this.setTalla(18);
        }
        if(talla == 20){        
            this.setNombre("Camisa");
            this.setPrecio(23);
            this.setTalla(20);
        }
    }
    
}
