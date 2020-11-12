package Postres;

public class Pastel extends Postre
{
    public Pastel(String sabor)
    {
        super(sabor, 15.55);

    }

    @Override
    public String toString() 
    {
        return "Pastel{" + "sabor= " + super.getSabor() + ", precioParcial= " + super.getPrecioParcial() + ", aderezos=" + super.getAderezos() + '}';
    }
}
