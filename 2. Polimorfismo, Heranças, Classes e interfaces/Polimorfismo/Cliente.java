package Polimorfismo;

public class Cliente implements Autenticacao {

    private Autenticavel autenticador;

    public Cliente(){
        this.autenticador = new Autenticavel();
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
