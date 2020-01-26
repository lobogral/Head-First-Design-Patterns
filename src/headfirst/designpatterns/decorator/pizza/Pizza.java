package headfirst.designpatterns.decorator.pizza;

public abstract class Pizza {

    String descripcion = "Pizza básica";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();
}