package br.com.TestandoBibliotecas;

public class ArrayString { //testando arrays na linha de comando (cmd)
    
    public static void main(String[] args) {
        
        System.out.println("Funcionou!!");

        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
