package headfirst.designpatterns.facade.hometheater;

public class LucesDeTeatro {

    String descripcion;

    public LucesDeTeatro(String descripcion) {
        this.descripcion = descripcion;
    }

    public void encender() {
        System.out.println(descripcion + " encendido");
    }

    public void apagar() {
        System.out.println(descripcion + " apagado");
    }

    public void atenuacion(int nivel) {
        System.out.println(descripcion + " atenuando a " + nivel  + "%");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}