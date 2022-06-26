package Polimorfismo;
public class testeGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("João");
        g1.setCpf("12345678-9");
        g1.setSalario(5000);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        //g1.setSenha(4444);
        //boolean autenticou =  g1.autentica(4444);
        //System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
