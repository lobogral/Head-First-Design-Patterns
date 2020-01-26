package headfirst.designpatterns.strategy;

public class PatoAzulon extends Pato {

    public PatoAzulon() {
        comportamientoCua = new Cua();
        comportamientoVuelo = new VolarConAlas();
    }

    @Override
    public void mostrar() {
        System.out.println("Soy un pato azulon real");
    }
}