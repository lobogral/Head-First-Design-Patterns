package headfirst.designpatterns.adapter.ducks;
import java.util.Random;

public class AdaptadorPato implements Pavo {

    Pato pato;
    Random aleatorio;

    public AdaptadorPato(Pato pato) {
        this.pato = pato;
        aleatorio = new Random();
    }

    @Override
    public void gluglu() {
        pato.cua();
    }

    @Override
    public void volar() {
        if (aleatorio.nextInt(5)  == 0) {
            pato.volar();
        }
    }
}