package Postres;



public class Helado extends Postre
{
    public Helado(String sabor)
    {
        super(sabor,7.85);
    }

    @Override
    public String toString() 
    {
        return "Helado{" + "sabor=" + super.getSabor() + ", precioParcial=" + super.getPrecioParcial() + ", aderezos=" + super.getAderezos() + '}';
    }
    
}
