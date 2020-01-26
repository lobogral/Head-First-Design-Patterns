package headfirst.designpatterns.facade.hometheater;

public class ReproductorCD {

    String descripcion;
    int pistaActual;
    Amplificador amplificador;
    String titulo;

    public ReproductorCD(String description, Amplificador amplifier) {
        this.descripcion = description;
        this.amplificador = amplifier;
    }

    public void encender() {
        System.out.println(descripcion + " encendido");
    }

    public void apagar() {
        System.out.println(descripcion + " apagado");
    }

    public void expulsar() {
        titulo = null;
        System.out.println(descripcion + " expulsado");
    }

    public void reproducir(String titulo) {
        this.titulo = titulo;
        pistaActual = 0;
        System.out.println(descripcion + " reproduciendo \"" + titulo + "\"");
    }

    public void reproducir(int pista) {
        if (titulo == null) {
            System.out.println(descripcion + " no se puede reproducir la pista " + pistaActual + 
                                ", disco no insertado");
        } else {
            pistaActual = pista;
            System.out.println(descripcion + " reproduciento pista " + pistaActual);
        }
    }

    public void detener() {
        pistaActual = 0;
        System.out.println(descripcion + " detenido");
    }

    public void pausar() {
        System.out.println(descripcion + " pausado \"" + titulo + "\"");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}