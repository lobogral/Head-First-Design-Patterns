package headfirst.designpatterns.adapter.ducks;

public class PavoSalvaje implements Pavo {

    @Override
    public void gluglu() {
        System.out.println("Gluglu gluglu");
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando una distancia corta");
    }
}