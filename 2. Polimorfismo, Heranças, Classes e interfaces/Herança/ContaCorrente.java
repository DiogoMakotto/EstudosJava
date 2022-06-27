package Herança;

//new ContaCorrente();
public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorAsacar = valor + 0.2; // testando polimorfismo com uma taxa de 0.2 por saque
        return super.saca(valorAsacar);
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
