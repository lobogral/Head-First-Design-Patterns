package headfirst.designpatterns.facade.hometheater;

public class PalomitasDeMaiz {

    String descripcion;

    public PalomitasDeMaiz(String descripcion) {
        this.descripcion = descripcion;
    }

    public void encender() {
        System.out.println(descripcion + " encendido");
    }

    public void apagar() {
        System.out.println(descripcion + " apagado");
    }

    public void pop() {
        System.out.println(descripcion + " ¡Las palomitas de maiz estan listas!");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}