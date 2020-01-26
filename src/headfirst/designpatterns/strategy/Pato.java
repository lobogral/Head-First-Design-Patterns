package headfirst.designpatterns.strategy;

public abstract class Pato {

    ComportamientoVuelo comportamientoVuelo;
    ComportamientoCua comportamientoCua;

    public void setComportamientoVuelo(ComportamientoVuelo cv) {
        comportamientoVuelo = cv;
    }

    public void setComportamientoCua(ComportamientoCua cc) {
        comportamientoCua = cc;
    }

    abstract void mostrar();

    public void realizarVuelo() {
        comportamientoVuelo.volar();
    }

    public void realizarCua() {
        comportamientoCua.cua();
    }

    public void nadar() {
        System.out.println("!Todos los patos flotan, incluso los señuelos!");
    }
}