package Thread_Auto_Lanzado;


public class main {
    public static void main(String[] args) {
        SelfRun objActivo = new SelfRun();

        // Espera durante 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        // Termina el objeto activo
        System.out.println("main invoca stopRequest()");
        objActivo.stopRequest();
    }
}