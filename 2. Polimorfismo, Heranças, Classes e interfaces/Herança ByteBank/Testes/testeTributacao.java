package Testes;

public class testeTributacao {
//classe destinada para aplicar tributação em contas poupança && corrente
    public static void main(String[] args) {
        modelo.ContaCorrente cc = new modelo.ContaCorrente(222, 333);
        cc.deposita(100.0);

        modelo.seguroVida seguro = new modelo.seguroVida();

        modelo.CalculadorImposto calc = new modelo.CalculadorImposto();
        calc.registro(cc);
        calc.registro(seguro);

        System.out.println(calc.getTotalImposto());
    }
    
}
