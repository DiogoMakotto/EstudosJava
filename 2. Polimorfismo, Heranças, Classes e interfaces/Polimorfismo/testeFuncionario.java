package Polimorfismo;

import Herança.Cliente;

public class testeFuncionario {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        

        Gerente diogo = new Gerente();
        diogo.setNome("Diogo Makotto");
        diogo.setCpf("12345678-9");
        diogo.setSalario(1000.00);

        System.out.println(diogo.getNome());
        System.out.println(diogo.getBonificacao());
        
	}
}
