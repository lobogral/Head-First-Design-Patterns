package headfirst.designpatterns.strategy;

public class PatoCaucho extends Pato {

    public PatoCaucho() {
        comportamientoVuelo = new VolarImposible();
        comportamientoCua  = () -> System.out.println("Neec");
    }

    public PatoCaucho(ComportamientoVuelo flyBehavior, ComportamientoCua quackBehavior) {
        this.comportamientoVuelo = flyBehavior;
        this.comportamientoCua = quackBehavior; 
    }

    @Override
    public void mostrar() {
        System.out.println("Soy un pato de caucho");
    }
}