package Polimorfismo;

//extends é utilizado para atribuir uma classe mãe para uma filha > assina contrato de autenticação
public class Gerente extends Funcionario implements Autenticacao{

    private Autenticavel autenticador;

    public Gerente(){
        this.autenticador = new Autenticavel();
    }

    // função de bonificação do nosso funcionario do gerente
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getSalario();
        // boa pratica utilizar super no lugar de this quando o atribututo é de outra
        // classe
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
