package Polimorfismo;

public class testeSistemaInterno {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador adm = new Administrador();
        adm.setSenha(222);

        Cliente cliente = new Cliente();
        cliente.setSenha(2221);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);

    }

}
