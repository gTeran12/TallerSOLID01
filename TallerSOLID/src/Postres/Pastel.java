package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Pastel extends Postre
{
 
    
    public Pastel(String sabor)
    {
        super(sabor, 15.55);

    }
    
    public ArrayList<Aderezo> getAderezos() 
    {
        return aderezos;
    }

    @Override
    public String toString() 
    {
        return "Pastel{" + "sabor=" + super.getSabor() + ", precioParcial=" + 15.55 + ", aderezos=" + super.getAderezos() + '}';
    }

    

    
    
}
