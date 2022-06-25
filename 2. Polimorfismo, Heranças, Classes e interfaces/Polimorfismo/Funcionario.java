package Polimorfismo;

//abstract na classe significa que ela não tem instancia propria
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

		//protected utilizado para liberar acesso aos filhos da classe mãe
	
    //função de bonificação do nosso funcionario + abstract significa que o metodo não tem corpo (garante que os filhos vão utilizar)
    public abstract double getBonificacao();
    
    //getters e seters
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
    
}
