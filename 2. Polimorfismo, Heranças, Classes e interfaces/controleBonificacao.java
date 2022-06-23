public class controleBonificacao {

    private double somatoria;

    public void registra(Funcionario f) {
        double bonificacao = f.getBonificacao();
        this.somatoria = this.somatoria + bonificacao;
    }

    public double getSomatoria() {
        return somatoria;
    }

}
