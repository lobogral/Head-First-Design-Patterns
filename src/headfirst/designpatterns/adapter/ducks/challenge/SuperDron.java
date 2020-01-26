package headfirst.designpatterns.adapter.ducks.challenge;

public class SuperDron implements Dron {

    @Override
    public void bip() {
        System.out.println("Bip bip bip");
    }

    @Override
    public void activarRotores() {
        System.out.println("Los rotores estan girando");
    }

    @Override
    public void despegar() {
        System.out.println("Despegando");
    }
}