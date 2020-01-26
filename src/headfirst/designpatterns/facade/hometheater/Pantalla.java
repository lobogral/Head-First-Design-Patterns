package headfirst.designpatterns.facade.hometheater;

public class Pantalla {

    String descripcion;

    public Pantalla(String descripcion) {
        this.descripcion = descripcion;
    }

    public void subir() {
        System.out.println(descripcion + " subiendo");
    }

    public void bajar() {
        System.out.println(descripcion + " bajando");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}