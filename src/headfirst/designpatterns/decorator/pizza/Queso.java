package headfirst.designpatterns.decorator.pizza;

public class Queso extends DecoradorCorteza {

    public Queso(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", Queso";
    }

    @Override
    public double costo() {
        return pizza.costo(); // El queso es gratis
    }
}