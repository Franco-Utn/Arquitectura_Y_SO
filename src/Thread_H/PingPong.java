package Thread_H;
import static java.lang.Thread.sleep;

public class PingPong extends Thread {
    private String word; //Lo que va a escribir
    private int delay; //Tiempo entre escrituras

    public PingPong(String queDecir, int cadaCuantosMs) {
        word = queDecir;
        delay = cadaCuantosMs;
    }

    public void run() { //se sobre escribe run() de Thread
        while (true) {
            System.out.println(word + " ");
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
