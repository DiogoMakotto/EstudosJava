package br.com.TestandoBibliotecas;

public class String {     
    public static void main(String[] args) {
        
        int a = 3;
        String nome = "Diogo";  //object literal

        // ---------- Contains ----------

        System.out.println(nome.Contains("Di"));    //verifica se contem esses caracteres na string

        // ---------- isEmpty e trim ----------

        String vazio = "";
        String outroVazio = vazio.trim();   //trim remove espaços vazios do inicio e fim

        System.out.println(outroVazio);
        System.out.println(vazio.isEmpty()); //verifica se a string esta vazia e retorna um boolean 

        // ---------- lenght ----------

        for(int index = 0; index < nome.lenght(); index++ ){
            System.out.println(nome.charAt(index)); //imprime caracter por caracter passando no laço
        }

        System.out.println(nome.lenght());  //devolve o tamanho da string

        // ---------- subString ----------

        String subString = nome.subSting(1);  //subtrai o caracter 1 da string e mostra a sobra
        System.out.println(subString);

        // ---------- indexOf ----------

        int posicao = nome.indexOf("og"); //semelhante charAt porem mostra mais de um caractere
        System.out.println(posicao);

        // ---------- charAt ----------

        char C = nome.charAt(2);    //mostra o caractere na posição determinada começa 0
        System.out.println(C);

        // ---------- replace, toUpperCase e toLowerCase ----------
        
        char c = 'o'; //utilizado para apenas 1 caractere
        char d = 'O';
        String formatado = new String("Diogo"); //metodo correto porém não pratico

        String formatadoReplace = nome.replace(c, d); //troca de caracteres ou sequencia

        String formatadoUpper = nome.toUpperCase();      //Converte caracteres para caixa alta

        String formatadoLower = nome.toLowerCase();    //Converte caracteres para caixa baixa

        System.out.println(nome);   //String é imutavel
        System.out.println(formatadoReplace);
        System.out.println(formatadoUpper);
        System.out.println(formatadoLower);
    }
}
