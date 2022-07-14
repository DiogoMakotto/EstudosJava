package br.com.TestandoBibliotecas;

import java.util.Vector;

public class Vector {
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<String>();
        //adicionando elementos no final do vetor
	    vector.add("Diogo");
	    vector.add("Arnaldo");
        vector.add("Joana");
        vector.add("Juventus");
        System.out.println(vector);
        //adicionando elementos no índice especificado
        vector.add(2,"Douglas");
        System.out.println(vector);
        //obtendo elementos por índice
        System.out.println("O elemento no índice 2 é: "+vector.get(2));
        //obtendo o primeiro elemento
        System.out.println("O primeiro elemento deste vetor é: "+vector.firstElement());
        //obtendo o último elemento
        System.out.println("O último elemento deste vetor é: "+vector.lastElement());
        //como verificar se o vetor está vazio ou não
        System.out.println("Este vetor está vazio: "+vector.isEmpty());
    }
}
