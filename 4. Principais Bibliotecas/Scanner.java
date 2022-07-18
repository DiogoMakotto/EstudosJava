package br.com.TestandoBibliotecas;

import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner MeuObj = new Scanner(System.in);
        System.out.println("Adicione seu nome");
    
        String userName = MeuObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
