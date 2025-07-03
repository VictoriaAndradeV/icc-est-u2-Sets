package controller.ejercicios;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio {

    public Ejercicio() {
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println("Ejercicio 2");
        System.out.println("murciélago es isograma = " + esIsograma("murcielago"));
        System.out.println("camaleon es isograma = " + esIsograma("camaleon"));

        System.out.println("Ejercicio 3");
        String texto = """
        La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. 
        Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, 
        la IA está presente en casi todos los aspectos de nuestra vida diaria. 
        Sin embargo, este avance también plantea desafíos éticos, sociales y económicos 
        que deben ser cuidadosamente analizados. 
        ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?

        Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, 
        la educación y el medio ambiente. 
        Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, 
        personalizar la enseñanza o monitorear los ecosistemas en tiempo real. 
        No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.

        En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, 
        sino también en el impacto que genera en la humanidad y en el planeta. 
        El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
        System.out.println("Cantidad de palabras únicas: " + contarPalabrasUnicas(texto));
    }
    

    public boolean tieneDuplicados(int [] numeros){
        Set<Integer> set = new HashSet<>(); //generico
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(45);

        for(int num: numeros){
            if(!set.add(num)){
                return true;
            }
        } 
        return false;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> letras = new HashSet<>();

        for (char c : palabra.toLowerCase().toCharArray()) {
            if (letras.contains(c)) {
                return false; // letra repetida, no es isograma
            }
        letras.add(c);
        }
        return true; // todas las letras fueron únicas
    }

    public int contarPalabrasUnicas(String frase) {
        Set<String> palabrasUnicas = new HashSet<>();
    
        // Dividimos por cualquier carácter que no sea letra ni número
        String[] palabras = frase.toLowerCase().split("[^a-záéíóúüñ0-9]+");

        for (String palabra : palabras) {
            if (!palabra.isBlank()) {
                palabrasUnicas.add(palabra);
            }
        }
        return palabrasUnicas.size();
    }


}
