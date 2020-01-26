package headfirst.designpatterns.strategy;

public class VolarImposible implements ComportamientoVuelo {

    @Override
    public void volar() {
        System.out.println("No puedo volar");
    }
}