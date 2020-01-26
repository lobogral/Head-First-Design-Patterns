package headfirst.designpatterns.decorator.pizza;

public class CortezaGruesa extends Pizza {

    public CortezaGruesa() {
        descripcion = "Pizza de corteza gruesa, con salsa de tomate";
    }

    @Override
    public double costo() {
        return 7.99;
    }

}