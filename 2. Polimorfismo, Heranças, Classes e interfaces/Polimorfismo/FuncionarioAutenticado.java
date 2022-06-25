package Polimorfismo;

public abstract class FuncionarioAutenticado extends Funcionario {

    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    // autenticação de senha
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
