package controllers;
import java.util.Set;

import java.util.EnumSet;
import java.util.HashSet;

public class Ejercicios {


    String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
    String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";

    String texto = """
                    La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
    public Ejercicios(){
        System.out.println();
        System.out.println("-- Ejercicio 1 --");
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println();

        System.out.println("-- Ejercicio 2 --");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));
        System.out.println();

        System.out.println("-- Ejercicio 3 --");
        System.out.println("el texto tiene " + contarPalabrasUnicas(texto) + " palabras.");
        System.out.println();

        System.out.println("-- Ejercicio 4 --");
        System.out.println("el texto 1 tiene " + contarPalabrasUnicas(texto1) + " palabras.");
        System.out.println("el texto 2 tiene " + contarPalabrasUnicas(texto2) + " palabras.");
        System.out.println("Palabras únicas en común: " + contarPalabrasComunes(texto1, texto2));
        System.out.printf("Coincidencia léxica: %.2f%%\n", coincidenciaLexica(texto1, texto2));
        System.out.println("Palabras en común en texto 1: " + obtenerPalabrasComunes(texto1, texto2));
        System.out.println("Palabras en común en texto 2: " + obtenerPalabrasComunes(texto1, texto2));
        System.out.println();


    }

    public boolean tieneDuplicados(int[] numeros){
        HashSet <Integer> set = new HashSet<>();
        for(int num : numeros){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra){
        HashSet<Character> letras = new HashSet<>();
        for(char c: palabra.toLowerCase().toCharArray()){
            if(!letras.add(c)){
                return false;
            }
        }
        return true;
    }
    
    public int contarPalabrasUnicas(String frase){
        Set<String> palabrasUni = new HashSet <>();
        String[] palabras = frase.split("\\s+");
        for (String palabra : palabras) {
            palabrasUni.add(palabra);
        }
        return palabrasUni.size();
    }
    
    private Set<String> palabrasComunes(String texto) {
        Set<String> palabras = new HashSet<>();
        String[] partes = texto.split(" ");
        for (String parte : partes) {
            if (!parte.isEmpty()) {
                palabras.add(parte.toLowerCase());
            }
        }
        return palabras;
    }

    public int contarPalabrasComunes(String textoA, String textoB) {
        Set<String> setA = palabrasComunes(textoA);
        Set<String> setB = palabrasComunes(textoB);
        setA.retainAll(setB);
        return setA.size();
    }

    public double coincidenciaLexica(String textoA, String textoB) {
        Set<String> setA = palabrasComunes(textoA);
        Set<String> setB = palabrasComunes(textoB);

        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);

        setA.retainAll(setB);

        if (union.isEmpty()) return 0.0;
        return (setA.size() * 100.0) / union.size();
    }

    public Set<String> obtenerPalabrasComunes(String textoA, String textoB) {
    Set<String> setA = palabrasComunes(textoA);
    Set<String> setB = palabrasComunes(textoB);
    setA.retainAll(setB);
    return setA;
    }
}