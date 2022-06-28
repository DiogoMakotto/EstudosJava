package Herança;

public class testeTributacao {
//classe destinada para aplicar tributação em contas poupança && corrente
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        seguroVida seguro = new seguroVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registro(cc);
        calc.registro(seguro);

        System.out.println(calc.getTotalImposto());
    }
    
}
