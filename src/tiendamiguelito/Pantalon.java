/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamiguelito;

/**
 *
 * @author USER
 */
public class Pantalon extends Producto{
   
    public Pantalon() {
        
    }   
    
    public Pantalon(int talla) {
        if(talla == 16){        
            this.setNombre("Pantalón");
            this.setPrecio(20);
            this.setTalla(16);
        }
        if(talla == 18){        
            this.setNombre("Pantalón");
            this.setPrecio(25);
            this.setTalla(18);
        }
        if(talla == 20){        
            this.setNombre("Pantalón");
            this.setPrecio(30);
            this.setTalla(20);
        }
    }
    
}
