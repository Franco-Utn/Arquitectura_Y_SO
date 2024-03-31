package Estados_Thread.Join;

public class Ejemplo_join {

    public static void main(String[] args) {
        Obrera agente = new Obrera();
        agente.start();

        // Hace algo durante el cálculo.
        // ...

        try {
            agente.join();
        } catch (InterruptedException e) {
        }

        // Utiliza el resultado.
        String resultado = agente.getResultado();
        System.out.println("Resultado: " + resultado);
    }
}