package br.com.ByteBank.banco.modelo;

public class saldoInsuficiente extends RuntimeException{
    
    public saldoInsuficiente(String msg){
        super(msg);
    }
}
