package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

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

    public ArrayList<Aderezo> getAderezos() 
    {
        return aderezos;
    }
    
    public void AgregarAderezo(Aderezo aderezo){
        this.aderezos.add(aderezo);
    }
    
    public void QuitarAderezo(Aderezo aderezo){
        this.aderezos.remove(aderezo);
    }
}
