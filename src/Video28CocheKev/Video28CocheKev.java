/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video28CocheKev;

import javax.swing.JOptionPane;

/**
 *
 * @author HP ENVY
 */
public class Video28CocheKev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche c = new Coche();
        
        JOptionPane.showMessageDialog(null,"Caracteristicas de un automovil");
        
        System.out.println("Caracteristicas del automovil");
        
        System.out.println();
        
        System.out.println("El automovil tiene " + c.ancho + " Cm de ancho" );
        
        System.out.println("El automovil tiene " + c.largo + " Cm de largo" );
        
        System.out.println("El automovil tiene " + c.motor + " Caballos de fuerza" );
        
        System.out.println("El automovil tiene " + c.peso + " Kg de peso" );
        
        System.out.println("El automovil tiene " + c.ruedas + " Ruedas" );
        
        
    }
    
}
