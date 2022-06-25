package Polimorfismo;
 

    public class SistemaInterno {

        private int senha = 222;

        public void autentica(FuncionarioAutenticado fa){
            boolean autenticou = fa.autentica(this.senha);
            if(autenticou) {
                System.out.println("Acesso liberado");
            }else{
                System.out.println("Acesso negado");
            }
        }

    }