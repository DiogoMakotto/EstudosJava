package br.com.TestandoBibliotecas;

public class System {
    
    public static void main(String[] args) {
        
        /**
         *  System.out.println();
         *  
         *  System 
         *      - é uma classe, da biblioteca java.lang, com acesso publico (public)
         * 
         *  Out
         *      - é um atributo, público, referencia e static (Estático)
         * 
         *  printLn
         *      - é um método, público, não estático (static) e sobrecarga
         * 
         *  Object 
         *      - referência mãe (genérico) de toda classe
         *  
         * */ 


         System.out.println("String"); // aceita strings
         printLn();

         System.out.println(3);     //aceita int
         printLn();

         System.out.println(false);        // aceita boolean
         printLn();

         System.out.println(object.toString());        // metodo toString() fornece a localidade dos objetos 
         printLn();
    }    
    
    static void printLn(){}

    static void printLn(int a){}

    static void printLn(boolean valor){}

    @Override   
    public String toString() {      //método especifico 
        return super.toString();
    }
}
