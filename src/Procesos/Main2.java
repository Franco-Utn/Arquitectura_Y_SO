package Procesos;

public class Main2 {
    public static void main(String[] args) {
        Proceso [] proceso = new Proceso[10];
        for (int i=0; i<proceso.length;i++){
            proceso[i] = new Proceso(i,"Proceso"+i);
            proceso[i].start();
        }
        try{
            proceso[2].join();
        }catch (InterruptedException e){
            System.out.println("AYIYIYi");
    }
}
}
