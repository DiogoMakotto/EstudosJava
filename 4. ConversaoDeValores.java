
public class ConversaoDeValores {
    
	public static void main(String[] args){

        float pontoFlutuante = 3.14f;

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);
        
        //numeros grandes
        long numeroGrande = 32432423523L;
        
        //numeros pequenos
        short valorPequeno = 2131;
        
        //numeros em byte
        byte b = 127;
        
        //valor 0.30000000000000004

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
