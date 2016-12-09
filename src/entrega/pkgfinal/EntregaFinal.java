/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega.pkgfinal;

import java.util.Scanner;


/**
 *
 * @author santi
 */
public class EntregaFinal 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        
        Control universal1=new Control();
        Grabadora electrodomestico1=new Grabadora();
              
        int opcion;
        do
        {
             System.out.println("Ingrese 1 para encender sistema");
             opcion=read.nextInt();
                if(opcion==1)
                {
                   universal1.encender();
                   universal1.mostrarMenu();
                }
        }
        while (opcion!=1);
        
        do
        {
            if (opcion==2)
            {
                electrodomestico1.mostrarMenu();
            }
        }
        while (opcion!=2);

        

                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
