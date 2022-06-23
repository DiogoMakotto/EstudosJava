//extends é utilizado para atribuir uma classe mãe para uma filha
public class Gerente extends Funcionario{
	private int senha;
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	//autenticação de senha 
	public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    //função de bonificação do nosso funcionario do gerente
    public double getBonificacao(){
    	return super.getBonificacao() + super.getSalario(); 
         //boa pratica utilizar super no lugar de this quando o atribututo é de outra classe
    }
    
}
