package Delegacion_costosa;

public class ThreadAgente {

    public static void operacionCostosa() {
        // Implementación de la operación costosa
        // ...
    }

    public static void main(String[] args) {
        // Lanza la ejecución costosa en un thread anónimo concurrente
        new Thread(new Runnable() {
            @Override
            public void run() {
                operacionCostosa();
            }
        }).start();

        // main ejecuta concurrentemente otra tarea de interés
        // ...
    }
}
