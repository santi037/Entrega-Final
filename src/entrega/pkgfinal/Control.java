/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega.pkgfinal;

/**
 *
 * @author santi
 */
public class Control {
    String electrodomesticos;
    boolean encendido;
    
    public void encender()
    {
       if (encendido==true)
       {encendido=false;
       }
       else 
       {
             encendido=true;
       }
    }
    
    public void mostrarMenu()
    {
        System.out.println("-----------------"
                           +"\n 1-Para Ingresar a Grabadora presione 2");
        
    }
}
