/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Deja mi lapto ¬¬...!
 */
public class Postre 
{
    private String sabor;
    private double precioParcial;
    ArrayList<Aderezo> aderezos;

    public Postre(String sabor, double precioParcial) 
    {
        this.sabor = sabor;
        this.precioParcial = precioParcial;
        this.aderezos = new ArrayList<>();
    }
    
     
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public void AgregarAderezo(Aderezo aderezo){
        aderezos.add(aderezo);
    }
    
    public void QuitarAderezo(Aderezo aderezo){
        aderezos.remove(aderezo);
    }
    
    
}
