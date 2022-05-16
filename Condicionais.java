public class Condicionais.java {
    
    public static void main(String[] args) {
        System.out.println("Aprendendo a utilizar condicionais");
        int idade = 20;
        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        }else {
            if(quantidadePessoas >= 2) {
                System.out.println("você não tem 18, mas " + "pode entrar, pois está acompanhado");
            } else {
            System.out.println("infelizmente você não pode entrar");
            }
        }
    }

}
