package controller;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets(){

    }
    //vamos a hacer que el metodo retorne la variable
    public Set<String> construirHashSet(){
        Set<String> palabras = new HashSet<>(); //generico
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        palabras.add("Celulas");
        return palabras;
    }

    public Set<String> construirLinkedHashSet(){
        Set<String> linkedWords = new LinkedHashSet<>();
        linkedWords.add("Laptop");
        linkedWords.add("Manzana");
        linkedWords.add("Pera");
        linkedWords.add("Celular");
        linkedWords.add("Laptop");
        linkedWords.add("Pera");
        linkedWords.add("Laptop");
        linkedWords.add("Celulas");
        return linkedWords;
    }

    public Set<String> construirTreeSet(){
        Set<String> treeWords = new TreeSet<>();
        treeWords.add("Laptop");
        treeWords.add("Manzana");
        treeWords.add("Pera");
        treeWords.add("Celular");
        treeWords.add("Laptop");
        treeWords.add("Pera");
        treeWords.add("Laptop");
        treeWords.add("Celulas");
        return treeWords;
    }

    public Set<String> construirTreeSetConComparador(){
        //Crear un comparador
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                //Comparamos la longitud
                int result = Integer.compare(s1.length(), s2.length());
                //si tienen la misma longitud, comparamos alfabeticamente
                if(result == 0){
                    result = s1.compareToIgnoreCase(s2);
                }
                return result;
            }
        };

        Set<String> treeWords = new TreeSet<>(comparadorLongitud);
        treeWords.add("Laptop");
        treeWords.add("Manzana");
        treeWords.add("Pera");
        treeWords.add("Celular");
        treeWords.add("Laptop");
        treeWords.add("Pera");
        treeWords.add("Laptop");
        treeWords.add("Celulas");
        return treeWords;
    }
}
