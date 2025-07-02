package utils;
import java.util.Comparator;
import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //comparo apellido alfabeticamente
        int resApell = o1.getApellido().compareToIgnoreCase(o2.getApellido());

        // si los apellidos son iguales comparo por el nombre
        if(resApell !=0){
            return resApell;
        }

        int resNom = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        return resNom;
    }   
}