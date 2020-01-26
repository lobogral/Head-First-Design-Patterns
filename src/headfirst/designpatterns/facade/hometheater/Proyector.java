package headfirst.designpatterns.facade.hometheater;

public class Proyector {

    String descripcion;
    ReproductorDVD reproductorDVD;

    public Proyector(String descripcion, ReproductorDVD reproductorDVD) {
        this.descripcion = descripcion;
        this.reproductorDVD = reproductorDVD;
    }

    public void encender() {
        System.out.println(descripcion + " encendido");
    }

    public void apagar() {
        System.out.println(descripcion + " apagado");
    }

    public void modoPantallaPanoramica() {
        System.out.println(descripcion + " en modo de pantalla panoramica (relacion de aspecto 16x9)");
    }

    public void modoTV() {
        System.out.println(descripcion + " en modo tv (relacion de aspecto 4x3)");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}