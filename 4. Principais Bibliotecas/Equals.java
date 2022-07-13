package br.com.TestandoBibliotecas;

// ---------- String equals ----------

public class Equals {
    
    public static void main(String[] args) {
        
        String myStr1 = "Olá";
        String myStr2 = "Olá";
        String myStr3 = "Outra String";
        System.out.println(myStr1.equals(myStr2)); // Retorna true pois são iguais
        System.out.println(myStr1.equals(myStr3)); // Retorna false pois são diferentes
    }
    
}
