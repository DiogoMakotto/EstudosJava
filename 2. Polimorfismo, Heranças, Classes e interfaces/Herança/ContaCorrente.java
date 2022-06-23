package Herança;

//new ContaCorrente();
public class ContaCorrente extends Conta{
    
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorAsacar = valor + 0.2; //testando polimorfismo com uma taxa de 0.2 por saque
        return super.saca(valorAsacar);
    }
}
