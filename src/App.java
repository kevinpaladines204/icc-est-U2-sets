import controllers.Sets;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- HashSet ---");
        Sets sets = new Sets();
        runHashSet(sets);
        System.out.println();
        System.out.println("--- LinkedHashSet ---");
        runLinkedHashSet(sets);
        System.out.println();
        System.out.println("--- TreeSet ---");
        runTreeSet(sets);
        System.out.println();
        System.out.println("--- TreeSet con Comparador ---");
        runTreeSetConComparador(sets);
        System.out.println();
        System.out.println("--- Con Comparador ---");
        runConComparador(sets);


    }

    public static void runHashSet(Sets sets){
        Set<String> palabras = sets.construirHashSet();
        for(String palabra: palabras){
            System.out.println(palabra);
        }
        
    }

    public static void runLinkedHashSet(Sets sets){
        Set<String> palabras = sets.construirLinkedHashSet();
        for(String palabra: palabras){
            System.out.println(palabra);
        }
    }

    public static void runTreeSet(Sets sets){
        Set<String> palabras = sets.construirTreeSet();
        for(String palabra: palabras){
            System.out.println(palabra);
        }

    }

    public static void runTreeSetConComparador(Sets sets){
        Set<String> palabras = sets.construirTreeSetConComparador();
        for(String palabra: palabras){
            System.out.println(palabra);
        }
    }

    public static void runConComparador(Sets sets){
        Set<String> palabras = sets.conComparador();
        for(String palabra: palabras){
            System.out.println(palabra);
        }
    }
}
