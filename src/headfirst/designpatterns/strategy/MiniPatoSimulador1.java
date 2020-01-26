package headfirst.designpatterns.strategy;

public class MiniPatoSimulador1 {

    public static void main(String[] args) {

        Pato patoAzulon = new PatoAzulon();
        patoAzulon.realizarCua();
        patoAzulon.realizarVuelo();

        Pato patoModelado = new PatoModelado();
        patoModelado.realizarVuelo();
        patoModelado.setComportamientoVuelo(new VolarConCohete());
        patoModelado.realizarVuelo();

    }
}