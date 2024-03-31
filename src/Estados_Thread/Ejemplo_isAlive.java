package Estados_Thread;

public class Ejemplo_isAlive {

    public static void main(String[] args) {
        Obrera agente = new Obrera();
        agente.start();

        // Hace algo durante el cálculo.
        // ...

        // Espera que agente haya terminado.
        while (agente.isAlive()) {
            Thread.yield();
        }

        // Utiliza el resultado.
        String resultado = agente.getResultado();
        System.out.println("Resultado: " + resultado);
    }
}