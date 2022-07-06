package br.com.ByteBank.banco.Testes;

import br.com.ByteBank.banco.modelo.ContaCorrente;

public class testeConta {
    
    public static void main(String[] args) throws saldoInsuficiente {
        
        //ContaEspecial ce = new ContaEspecial(123, 5555);
        
        //Full Qualified Name FQN = nome pacote + obj
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);

        cc.transfere(10.0 , cp);

        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());
    }
}
