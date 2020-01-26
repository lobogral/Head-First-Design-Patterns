package headfirst.designpatterns.strategy;

public class VolarConCohete implements ComportamientoVuelo {

    @Override
    public void volar() {
        System.out.println("Estoy volando con un cohete");
    }
}