package Polimorfismo;

//extends é utilizado para atribuir uma classe mãe para uma filha
public class Gerente extends Funcionario {

    // função de bonificação do nosso funcionario do gerente
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getSalario();
        // boa pratica utilizar super no lugar de this quando o atribututo é de outra
        // classe
    }

}
