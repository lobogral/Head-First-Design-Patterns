package headfirst.designpatterns.decorator.pizza;

public class CortezaDelgada extends Pizza {

    public CortezaDelgada() {
        descripcion = "Pizza de corteza delgada, con salsa de tomate";
    }

    @Override
    public double costo() {
        return 7.99;
    }

}