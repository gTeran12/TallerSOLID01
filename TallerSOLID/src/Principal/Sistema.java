package Principal;
import Adicionales.TipoAderezo;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;

public class Sistema {
//    public static void main(String [ ] args)
//    {
//        // Producir un helado de vainilla y una torta de chocolate, 
//        // a ambos agregarles CREMA y FRUTILLAS
//        // y cambiar el tipo de leche por Leche Descremada
//        // Finalmente mostrar el precio final de cada uno
//        LecheEntera leche = new LecheDeslactosada();
//        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
//        
//        // Producir Helado
//        Postre helado_vainilla = new Helado("Vainilla");
//        helado_vainilla.AgregarAderezo(new TipoAderezo().setNombre("vainilla"));
//        helado_vainilla.AgregarAderezo(new TipoAderezo().setNombre("pistacho"));
//        //OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.CREMA);
//        //OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.FRUTILLA);
//        System.out.println(helado_vainilla);
//        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
//        //System.out.println(helado_vainilla.PrecioFinal());
//        Procesos.ManejadorDePrecio.showPrecioFinal(helado_vainilla);
//        
//        // Producir Pastel
//        Postre pastel_chocolate = new Pastel("Chocolate");
//        pastel_chocolate.AgregarAderezo(new TipoAderezo().setNombre("menta"));
//        pastel_chocolate.AgregarAderezo(new TipoAderezo().setNombre("almendra"));
//        
////        OperacionesAderezo.quitarAderezoPastel(pastel_chocolate, Aderezo.CREMA);
////        OperacionesAderezo.anadirAderezoPastel(pastel_chocolate, Aderezo.FRUTILLA);
//        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
//        //System.out.println(helado_vainilla.ManejadorDePrecioPrecioFinal(pastel_chocolate)); 
//        Procesos.ManejadorDePrecio.showPrecioFinal(pastel_chocolate);
//    }
    
    
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.AgregarAderezo(new TipoAderezo().setNombre("crema"));
            postre.AgregarAderezo(new TipoAderezo().setNombre("frutillas"));
            System.out.println(postre);
            LecheEntera leche= new LecheDeslactosada();
            mnj_leche.cambiarTipoLeche(leche, postre);
            ManejadorDePrecio.showPrecioFinal(postre);
        });        
        
    }

}
