package Adicionales;

public class TipoAderezo extends Aderezo 
{
    @Override
    public Aderezo setNombre(String nombre) 
    {
        super.nombre = nombre;
        return this;
    }
}
