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
public class Grabadora 
{
    boolean encendido;
    byte volumen;
    double emisora;
    boolean CD;
    boolean radio;
    
    
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
    
    public void subirVolumen()
    {
        if (volumen==32)
        {
            volumen=32;
        }
        else
        {
            volumen++;
        }    
    }   
    
    public void bajarVolumen()
    {
        if (volumen==0)
        {
            volumen=0;
        }
        else
        {
            volumen--;
        }
    }
    
    public void subirEmisora()
    {
        if(emisora==88.9)
           emisora=105.9;
        else
            emisora++;
    }
    
    public void bajarEmisora()
    {
        if (emisora==2)
            emisora=120;
        else
            emisora--;  
    }
    
    public void modoCD()
    {
        if (radio==true)
            radio=true;
        else
        {
            CD=true;
        }
    }
    
    public void modoRadio()
    {
        if (CD==true)
            CD=true;
        else
        {
            radio=true;
        }
    }
    
    public void mostrarMenu()
    {
        if(encendido==true)
        System.out.println("-----------------"
                           +"\n 2-Para Subir Volumen"
                           +"\n 3-Para Bajar Volumen"
                           +"\n 4-Para Subir Emisora"
                           +"\n 5-Para Bajar Emisora"
                           +"\n 6-Para Poner modo CD"
                           +"\n 7-Para Poner modo Radio"
                           +"\n 1-Para Apagar");
    }  
}
