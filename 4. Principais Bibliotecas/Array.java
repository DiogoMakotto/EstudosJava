package br.com.TestandoBibliotecas;

public class Array {
    
    public static void main(String[] args) {
        
        int[] idades = new int[5]; //inicialia o array com os valores padroes (zero)


        // ---------- Array simples ----------
        
        idades[0] = 29 ;
        idades[1] = 39 ;
        idades[2] = 49 ;
        idades[3] = 59 ;
        idades[4] = 69 ;
        
        int idade4 = idades[49];

        System.out.println(idade4);

        // ---------- Laço de repetição ----------

        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

    }
}
