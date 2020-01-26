package headfirst.designpatterns.decorator.pizza;

public class Aceitunas extends DecoradorCorteza {

    public Aceitunas(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", Aceitunas";
    }

    @Override
    public double costo() {
        return pizza.costo() + .30; 
    }
}