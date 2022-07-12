package br.com.TestandoBibliotecas;

import java.util.ArrayList; 

public class ArrayList {
    
    public static void main(String[] args) {

        // ---------- ArrayList simples ----------

        ArrayList<String> cars = new ArrayList<String>(); //<Generics> mostra ao compilador a classe e o objeto
        cars.add("Volvo");      //.add adiciona elementos a lista
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.get(0); //.get obtem o elemento em determinada posição

        cars.set(0, "Opel"); //.set modifica o elemento em determinado indice

        cars.remove(0); //.remove exclui o elemento em determinado indice

        // ---------- ArrayList Looping ----------

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Melons");
        fruits.add("Apples");
        fruits.add("oranges");
        fruits.add("limes");
        for (int i = 0; i < fruits.size(); i++) {
          System.out.println(fruits.get(i));
        }
        //for (String i : fruits) {
        //    System.out.println(i);}


      }       
}
