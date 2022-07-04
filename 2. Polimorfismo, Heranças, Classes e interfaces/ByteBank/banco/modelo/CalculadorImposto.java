package br.com.ByteBank.banco.modelo;

//import br.com.ByteBank.banco.modelo.*;

public class CalculadorImposto {
    
    private double totalImposto;

    public void registro(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
