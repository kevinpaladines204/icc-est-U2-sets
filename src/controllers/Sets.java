package controllers;
import java.util.*;

public class Sets {

    public Sets(){

    }
    
    public Set<String> construirHashSet(){
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;    
    }

    public Set<String> construirLinkedHashSet(){
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> construirTreeSet(){
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> construirTreeSetConComparador(){

        Comparator <String> comparador = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                //primero comparamos por longuitud
                int resl = Integer.compare(s1.length(), s2.length());
                // si son iguales en tam comparo alfabéticamente
                if (resl == 0){
                    return s1.compareTo(s2);
                }
                return resl;
            }     
        };

        Set<String> palabras = new TreeSet<>(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        return palabras;
    }

    //5to metodo que imprima en este orden
    //Manzana
    //celulas
    //celular
    //laptop
    //pera

    public Set<String> conComparador(){

        Comparator <String> comparador = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                //primero comparamos por longuitud
                int resl = Integer.compare(s2.length(), s1.length());
                // si son iguales en tam comparo alfabéticamente
                if (resl == 0){
                    return s2.compareTo(s1);
                }
                return resl;
            }     
        };

        Set<String> palabras = new TreeSet<>(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        return palabras;
    }

}
