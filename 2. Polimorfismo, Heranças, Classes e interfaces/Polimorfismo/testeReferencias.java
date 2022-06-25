package Polimorfismo;
public class testeReferencias {
    
    public static void main(String [] args){

        Gerente g1 = new Gerente();  //todo gerente é um funcionario porém nem todo funcionario é um gerente

        g1.setNome("Antonio");
        g1.setSalario(5000.0);
        
        Recrutador r = new Recrutador();
        r.setSalario(3000.0);

        controleBonificacao controle = new controleBonificacao();
        controle.registra(g1);
        controle.registra(r);

        System.out.println(controle.getSomatoria());

    }

}
