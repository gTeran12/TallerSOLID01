package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Helado implements Postre
{
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Helado(String sabor)
    {
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 7.85;
    }

    public ArrayList<Aderezo> getAderezos() 
    {
        return aderezos;
    }

    @Override
    public String toString() 
    {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }

    @Override
    public double PrecioFinal() 
    {
        double precioFinal=(this.precioParcial+(this.precioParcial*0.12))+(this.aderezos.size()*0.50);
        return precioFinal;
    }

    @Override
    public void AnadirAderezo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void QuitarAderezo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
