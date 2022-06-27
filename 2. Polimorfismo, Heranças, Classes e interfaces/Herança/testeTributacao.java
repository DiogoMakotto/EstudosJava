package Herança;

public class testeTributacao {

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
