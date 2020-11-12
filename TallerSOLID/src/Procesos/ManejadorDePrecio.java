/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Adicionales.Aderezo;
import Postres.Postre;

/**
 *
 * @author Deja mi lapto ¬¬...!
 */
public class ManejadorDePrecio {
    
    public static double calcularPrecioFinal(Postre p){
        
        double precioFinal=(p.getPrecioParcial()+(p.getPrecioParcial()*0.12))+(p.getAderezos().size()*0.50);
        return precioFinal;
    }
    
    public static void showPrecioFinal(Postre p){
        System.out.println("El precio final es: " + calcularPrecioFinal(p));
    }
}
