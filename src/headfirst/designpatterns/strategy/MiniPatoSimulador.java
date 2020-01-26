package headfirst.designpatterns.strategy;

public class MiniPatoSimulador {

    public static void main(String[] args) {

        PatoAzulon patoAzulon = new PatoAzulon();
        ComportamientoVuelo noPuedoVolar = () -> System.out.println("No puedo volar");
        ComportamientoCua neec = () -> System.out.println("Neec");
        PatoCaucho patitoDeGoma = new PatoCaucho(noPuedoVolar, neec);
        PatoSeñuelo patoSeñuelo = new PatoSeñuelo();

        Pato patoModelado = new PatoModelado();

        patoAzulon.realizarCua();
        patitoDeGoma.realizarCua();
        patoSeñuelo.realizarCua();

        patoModelado.realizarVuelo();
        patoModelado.setComportamientoVuelo(new VolarConCohete());
        patoModelado.realizarVuelo();
    }
}