package Enums;

public class enumsTeste {
    public static void main(String[] args) {
        
        Thread t = new Thread(() -> System.out.println("rodando...."));

        t.setPriority(Thread.MAX_PRIORITY);

        t.start();

        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        //name mostra a nomeção ou rotulo do valor do eNum
        System.out.println(pMin.name());
        System.out.println(pMax.name());

        //ordinal mostra a posição do eNum ou das constantes
        System.out.println(pMin.ordinal());
        System.out.println(pMax.ordinal());

        //utlizando o construtor que foi criado no enum 
        System.out.println(pMin.getValor());
        System.out.println(pMax.getValor());

        //Thread.State.NEW;
    }
}
