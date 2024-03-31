package currentThread;

public class Cliente extends Thread {

    @Override
    public void run() {
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
