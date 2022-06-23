package Polimorfismo;
public class Recrutador extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do RECRUTADOR");
        return super.getBonificacao() + 100;

    }

}
