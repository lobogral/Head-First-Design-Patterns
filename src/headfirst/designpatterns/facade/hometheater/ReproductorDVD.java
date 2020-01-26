package headfirst.designpatterns.facade.hometheater;

public class ReproductorDVD {

    String descripcion;
    int pistaActual;
    Amplificador amplificador;
    String pelicula;

    public ReproductorDVD(String descripcion, Amplificador amplificador) {
        this.descripcion = descripcion;
        this.amplificador = amplificador;
    }

    public void encender() {
        System.out.println(descripcion + " encendido");
    }

    public void apagar() {
        System.out.println(descripcion + " apagado");
    }

    public void expulsar() {
        pelicula = null;
        System.out.println(descripcion + " expulsado");
    }

    public void reproducir(String pelicula) {
        this.pelicula = pelicula;
        pistaActual = 0;
        System.out.println(descripcion + " reproduciendo \"" + pelicula + "\"");
    }

    public void reproducir(int pista) {
        if (pelicula == null) {
            System.out.println(descripcion + " no se puede reproducir la pista " + pista + " dvd no insertado");
        } else {
            pistaActual = pista;
            System.out.println(descripcion + " reproduciendo pista " + pistaActual + " de \"" + pelicula + "\"");
        }
    }

    public void detener() {
        pistaActual = 0;
        System.out.println(descripcion + " detenido \"" + pelicula + "\"");
    }

    public void pausar() {
        System.out.println(descripcion + " pausado \"" + pelicula + "\"");
    }

    public void setAudioDeDosCanales() {
        System.out.println(descripcion + " estableciendo audio de dos canales");
    }

    public void setSonidoEnvolvente() {
        System.out.println(descripcion + " estableciendo sonido envolvente");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}