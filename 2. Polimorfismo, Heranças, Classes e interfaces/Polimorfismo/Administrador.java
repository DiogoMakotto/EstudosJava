package Polimorfismo;

public class Administrador extends Funcionario implements Autenticacao{

    private Autenticavel autenticador;

    public Administrador(){
        this.autenticador = new Autenticavel();
    }

    @Override
    public double getBonificacao() {
        return 50;
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
