package headfirst.designpatterns.facade.hometheater;

public class Sintonizador {

    String descripcion;
    Amplificador amplificador;
    double frecuencia;

    public Sintonizador(String descripcion, Amplificador amplifier) {
        this.descripcion = descripcion;
    }

    public void encender() {
        System.out.println(descripcion + " encendido");
    }

    public void apagar() {
        System.out.println(descripcion + " apagar");
    }

    public void setFrecuencia(double frecuencia) {
        System.out.println(descripcion + " ajuste de frecuencia a " + frecuencia);
        this.frecuencia = frecuencia;
    }

    public void setAm() {
        System.out.println(descripcion + " estableciendo modo AM");
    }

    public void setFm() {
        System.out.println(descripcion + " estableciendo modo FM");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}