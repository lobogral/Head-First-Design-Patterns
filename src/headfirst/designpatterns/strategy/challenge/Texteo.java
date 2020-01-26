package headfirst.designpatterns.strategy.challenge;

public class Texteo implements EstrategiaParaCompartir {

    @Override
    public void compartir() {
        System.out.println("Estoy textando la foto");
    }
}