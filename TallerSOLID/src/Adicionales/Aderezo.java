package Adicionales;

public abstract class Aderezo
{
    public String nombre;
    
    public abstract Aderezo setNombre(String nombre);

    public String getNombre() 
    {
        return nombre;
    }
    
    @Override
    public String toString() 
    {
        return (this.nombre.toUpperCase());
    }
}
