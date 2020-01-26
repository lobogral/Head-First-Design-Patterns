package headfirst.designpatterns.strategy;

public class VolarConAlas implements ComportamientoVuelo {

    @Override
    public void volar() {
        System.out.println("¡¡Estoy volando!!");
    }
}