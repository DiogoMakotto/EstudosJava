public class testeFuncionario {
    public static void main(String[] args) {

        Funcionario diogo = new Funcionario();
        diogo.setNome("Diogo Makotto");
        diogo.setCpf("12345678-9");
        diogo.setSalario(1000.00);

        System.out.println(diogo.getNome());
        System.out.println(diogo.getBonificacao());
	}
}
