package headfirst.designpatterns.adapter.ducks;

import headfirst.designpatterns.adapter.ducks.challenge.AdaptadorDron;
import headfirst.designpatterns.adapter.ducks.challenge.SuperDron;
import headfirst.designpatterns.adapter.ducks.challenge.Dron;

public class PruebaAdaptadorPato {

    public static void main(String[] args) {

        PatoAzulon pato = new PatoAzulon();

        PavoSalvaje pavo = new PavoSalvaje();
        Pato adaptadorPavo = new AdaptadorPavo(pavo);

        System.out.println("El pavo dice...");
        pavo.gluglu();
        pavo.volar();

        System.out.println("\nEl pato dice...");
        pruebaPato(pato);

        System.out.println("\nEl adaptador del pavo dice...");
        pruebaPato(adaptadorPavo);

        // Desafio
        Dron dron = new SuperDron();
        Pato adaptadorDron = new AdaptadorDron(dron);
        System.out.println("\nEl adaptador del dron dice...");
        pruebaPato(adaptadorDron);
    }

    static void pruebaPato(Pato pato) {
        pato.cua();
        pato.volar();
    }
}