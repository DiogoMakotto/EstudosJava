public class testeReferencias {
    
    public static void main(String [] args){

        Funcionario g1 = new Gerente();  //todo gerente é um funcionario porém nem todo funcionario é um gerente

        g1.setNome("Antonio");
        String nome = g1.getNome();

        System.out.println(nome);
    }

}
