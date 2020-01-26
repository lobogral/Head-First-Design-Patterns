package headfirst.designpatterns.strategy.challenge;

public class CorreoElectronico implements EstrategiaParaCompartir {

    @Override
    public void compartir() {
        System.out.println("Estoy enviando la foto por correo electrónico");
    }
}