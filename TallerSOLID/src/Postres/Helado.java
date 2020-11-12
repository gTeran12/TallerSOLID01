package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Helado extends Postre
{
//    private String sabor;
   // private double precioParcialH;
//    private ArrayList<Aderezo> aderezos;
//    
    public Helado(String sabor)
    {
        super(sabor,7.85);
    }


    @Override
    public String toString() 
    {
        return "Helado{" + "sabor=" + super.getSabor() + ", precioParcial=" + 7.85 + ", aderezos=" + super.getAderezos() + '}';
    }



    
}
