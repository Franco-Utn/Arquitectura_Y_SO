package Thread_H;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        PingPong t1 = new PingPong("Ping",33);
        PingPong t2 = new PingPong("Pong",33);

        t1.start();
        t2.start();

        try {
            sleep(5000);
        }catch(InterruptedException e){};

        t1.stop();
        t2.stop();
    }

}
