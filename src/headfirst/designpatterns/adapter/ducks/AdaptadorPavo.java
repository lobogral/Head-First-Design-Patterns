package headfirst.designpatterns.adapter.ducks;

public class AdaptadorPavo implements Pato {

    Pavo pavo;

    public AdaptadorPavo(Pavo pavo) {
        this.pavo = pavo;
    }

    @Override
    public void cua() {
        pavo.gluglu();
    }

    @Override
    public void volar() {
        for(int i=0; i < 5; i++) {
            pavo.volar();
        }
    }
}