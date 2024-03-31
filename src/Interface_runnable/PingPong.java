package Interface_runnable;

    public class PingPong implements Runnable {

        private String palabra; // Lo que va a escribir.
        private int retraso; // Tiempo entre escrituras

        public PingPong(String queDecir, int cadaCuantosMs) {
            palabra = queDecir;
            retraso = cadaCuantosMs;
        }

        @Override
        public void run() {
            while (true) {
                System.out.print(palabra + " ");
                try {
                    Thread.sleep(retraso);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

