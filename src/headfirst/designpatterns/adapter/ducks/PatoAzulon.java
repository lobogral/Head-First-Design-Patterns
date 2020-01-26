package headfirst.designpatterns.adapter.ducks;

public class PatoAzulon implements Pato {

    @Override
    public void cua() {
        System.out.println("Cua");
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }
}