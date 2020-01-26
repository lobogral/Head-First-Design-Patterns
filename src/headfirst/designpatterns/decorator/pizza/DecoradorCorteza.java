package headfirst.designpatterns.decorator.pizza;

public abstract class DecoradorCorteza extends Pizza {

    Pizza pizza;

    @Override
    public abstract String getDescripcion();
}