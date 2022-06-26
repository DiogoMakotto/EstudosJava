package Polimorfismo;

//para interfaces precisamos deixar tudo abstratos sem componentes concretos
        //quem assina o contrato, precisa implementar todos metodos
            //setSenha
            //autentica
public abstract interface Autenticacao {

    public abstract void setSenha(int senha);

    // autenticação de senha
    public abstract boolean autentica(int senha);

}

