package Procesos;

public class Proceso extends Thread{
    private int PID;
    private String mensaje;

    public Proceso(int PID, String mensaje) {
        this.PID = PID;
        this.mensaje = mensaje;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void run() {
        System.out.println("Proceso qu "+ mensaje);
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
