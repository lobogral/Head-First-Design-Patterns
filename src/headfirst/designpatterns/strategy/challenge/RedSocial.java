package headfirst.designpatterns.strategy.challenge;

public class RedSocial implements EstrategiaParaCompartir {

    @Override
    public void compartir() {
        System.out.println("Estoy posteando la foto en la red social");
    }
}