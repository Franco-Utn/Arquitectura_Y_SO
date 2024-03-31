package Interrupcion_Thread.InterruptedException;

public class Ejemplo_FIn_Por_Interrupt {
    public static void main(String[] args) {
        Thread elThread = new MiThread();
        elThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        elThread.interrupt();
    }
}
