package headfirst.designpatterns.adapter.ducks.challenge;

import headfirst.designpatterns.adapter.ducks.Pato;

public class AdaptadorDron implements Pato {

    Dron dron;

    public AdaptadorDron(Dron dron) {
        this.dron = dron;
    }

    @Override
    public void cua() {
        dron.bip();
    }

    @Override
    public void volar() {
        dron.activarRotores();
        dron.despegar();
    }
}