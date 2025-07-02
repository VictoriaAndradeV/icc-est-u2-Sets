package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{
    @Override
    public int compare(Contacto o1, Contacto o2){
        //primero el apellido orden alfabetico
        int comparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());


        if(comparacionApellido != 0){
            return comparacionApellido;
        }

        return o1.getNombre().compareToIgnoreCase(o2.getNombre());
    }
               
}
