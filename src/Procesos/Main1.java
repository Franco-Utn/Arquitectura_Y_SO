package Procesos;

public class Main1 {
    public static void main(String[] args) {

        Proceso p1 = new Proceso(1,"Leyendo pendrive");
        Proceso p2 = new Proceso(2," calculando...");
        Proceso p3 = new Proceso(3,"Imprimoemdo");
        Proceso p4 =new Proceso(4,"Grabando");
                p1.start();
                p2.start();
                p3.start();
                p4.start();
    }
}