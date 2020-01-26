package headfirst.designpatterns.strategy;

public class PatoPielRoja extends Pato {

    public PatoPielRoja() {
        comportamientoVuelo = new VolarConAlas();
        comportamientoCua = new Cua();
    }

    @Override
    public void mostrar() {
        System.out.println("Soy un pato de piel roja real");
    }
}