package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Pastel extends Postre
{
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Pastel(String sabor)
    {
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 15.55;
    }
    
    public ArrayList<Aderezo> getAderezos() 
    {
        return aderezos;
    }

    @Override
    public String toString() 
    {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }

    

    
    
}
