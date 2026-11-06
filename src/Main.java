import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> dragos = new ArrayList<>();
        for (int i = 0; (i < 3); i++) {
            Thread t = new Thread(new D_SputaFuoco(String.valueOf(i)));
            dragos.add(t);
        }
        System.out.println("I draghi sono nati e pronti ad uccidere");
        Thread sangiorgio = new Thread(new Cavaliere("giorgio", dragos.get(1)));
        System.out.println("un cavalire è destinato a entrare nella storia e ucciderne uno");

        for (Thread t : dragos) {
            t.start();
        }
        System.out.println("i draghi sono partiti per distruggere i villaggi");
        sangiorgio.start();
        try{
            int a=0;
            a= 6/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception x){
            System.out.println(x);
        }finally{
            System.out.println("avrei dovuto stampare il risultato!!");
        }


        System.out.println("Giorgio si prepara anche egli alla battaglia e li insegue");

        try {
            for (Thread t : dragos) {
                t.join();
            }
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
      }
        System.out.println("il cavaliere ha atterrato il drago");


    }
}