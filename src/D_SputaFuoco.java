public class D_SputaFuoco extends Drago implements Runnable {
    public D_SputaFuoco(String nome) {
        super(nome);
    }
    @Override
    public void run() {
        for (int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            //generazione di un numero random da 0 a 1, se supera 0.5, viene catturata la principessa
            //da catturare se libera e il suo stato viene impostato a catturato
            System.out.println(this.getNome()+
                    " sputa fuoco e si libra nell'aria! Gioia immensa, al battito "+(1+i));
        }
    }
}