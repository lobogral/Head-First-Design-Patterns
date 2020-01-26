package headfirst.designpatterns.strategy;

public class PatoModelado extends Pato {

    public PatoModelado() {
        comportamientoVuelo = new VolarImposible();
        comportamientoCua = new Cua();
    }

    @Override
    public void mostrar() {
        System.out.println("Soy el modelo de un pato");
    }
}