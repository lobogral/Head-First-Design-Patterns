package headfirst.designpatterns.facade.hometheater;

public class Amplificador {

    String descripcion;
    Sintonizador sintonizador;
    ReproductorDVD reproductorDVD;
    ReproductorCD reproductorCD;

    public Amplificador(String descripcion) {
        this.descripcion = descripcion;
    }

    public void encender() {
        System.out.println(descripcion + " endendido");
    }

    public void apagar() {
        System.out.println(descripcion + " apagado");
    }

    public void setSonidoEstereo() {
        System.out.println(descripcion + " modo estereo activado");
    }

    public void setSonidoEnvolvente() {
        System.out.println(descripcion + " sonido envolvente activado (5 altavoces, 1 subwoofer)");
    }

    public void setVolumen(int nivel) {
        System.out.println(descripcion + " ajustando volumen a " + nivel);
    }

    public void setSintonizador(Sintonizador sintonizador) {
        System.out.println(descripcion + " ajustando sintonizador a " + reproductorDVD);
        this.sintonizador = sintonizador;
    }

    public void setReproductorDVD(ReproductorDVD reproductorDVD) {
        System.out.println(descripcion + " configurando el reproductor de DVD en " + reproductorDVD);
        this.reproductorDVD = reproductorDVD;
    }

    public void setReproductorCD(ReproductorCD reproductorCD) {
        System.out.println(descripcion + " configurando el reproductor de CD en " + reproductorCD);
        this.reproductorCD = reproductorCD;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}