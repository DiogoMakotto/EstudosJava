public class TestaCaracteres {

    public static void main(String[] args) {
        //char guarda um único código
        char letra = 'a';
        System.out.println(letra);

        //equivalente ao short guardando apenas valores positivos
        char valor = 66;
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);

        String frase = "Diogo esta aprendendo Java em ";
        System.out.println(frase);

        //string + string = concatenação
        frase = frase + 2022;
        System.out.println(frase);
    }
}