package Prioridades;

public class SimplePriorities extends Thread {
    private int countDown = 5;
    private volatile double d = 0; // No optimization

    public SimplePriorities(int priority) {
        setPriority(priority);
        start();
    }

    @Override
    public String toString() {
        return super.toString() + ": " + countDown;
    }

    public void run() {
        while (true) {
            // An expensive, interruptable operation: (commented out)
            // for (int i = 1; i < 100000; i++) d = d + (Math.PI + Math.E) / (double) i;
            for (int i = 0; i < 1000; i++) { // Simulate a simple but repetitive task
                d = d + 1;
            }
            System.out.println(this);
            synchronized (this) {
                if (--countDown == 0) return;
            }
        }
    }

    public static void main(String[] args) {
        new SimplePriorities(Thread.MAX_PRIORITY);
        for (int i = 0; i < 5; i++)
            new SimplePriorities(Thread.MIN_PRIORITY);
    }
}
