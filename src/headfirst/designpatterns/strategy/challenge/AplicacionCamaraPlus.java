package headfirst.designpatterns.strategy.challenge;

public class AplicacionCamaraPlus extends AplicacionCamaraDelCelular {

    @Override
    public void editar() {
        System.out.println("Características adicionales para "
                           + "edición de fotos elegantes");
    }
}