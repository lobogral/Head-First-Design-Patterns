package headfirst.designpatterns.adapter.ducks;

public class PruebaAdaptadorPavo {

    public static void main(String[] args) {

        PatoAzulon pato = new PatoAzulon();
        Pavo adaptadorPato = new AdaptadorPato(pato);

        for(int i=0;i<10;i++) {
            System.out.println("El adaptador del pato dice...");
            adaptadorPato.gluglu();
            adaptadorPato.volar();
        }
    }
}