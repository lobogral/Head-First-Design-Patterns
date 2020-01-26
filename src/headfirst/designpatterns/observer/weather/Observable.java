package headfirst.designpatterns.observer.weather;

import java.util.ArrayList;

public class Observable {

    private final ArrayList<Observador> observadores;

    public Observable(){
        observadores = new ArrayList<>();
    }

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        int i = observadores.indexOf(o);
        if (i >= 0) {
            observadores.remove(i);
        }
    }

    public void avisarObservadores() {
        for (Observador observer : observadores) {
            observer.actualizar();
        }
    }

}