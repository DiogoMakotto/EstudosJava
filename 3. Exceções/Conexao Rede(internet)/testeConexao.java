
public class testeConexao {
    
    public static void main(String[] args) {
        
        Conexao con = null;

        try {
            con = new Conexao();
            con.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally { //JVM sempre garante que o finally será executado
            con.fecha();
        }
    }
}
