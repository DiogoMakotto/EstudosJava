package Testes;

import javax.security.sasl.SaslException;

public class testSaca {
    public static void main(String[] args) {
        modelo.Conta conta = new modelo.ContaCorrente(123, 321);

        conta.deposita(200.0);
        try{
            conta.saca(210.0); //chamando a exception de saldo insuficiente por conta da falta de saldo
        }catch(Exception ex){
            System.out.println("Ex: " + ex.getMessage());       
        }
        System.out.println(conta.getSaldo());
    }
}
