package Tratamento;

public class checked {
    public static void main(String[] args) {
        
        exemplo x = new exemplo();
        try{
            x.teste();
        } catch(MinhaExcecao ex){
            System.out.println("Tratando.....");
        }
    }
}
