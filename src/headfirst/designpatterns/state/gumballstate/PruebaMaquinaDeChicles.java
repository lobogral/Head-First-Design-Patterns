package headfirst.designpatterns.state.gumballstate;

public class PruebaMaquinaDeChicles {

    public static void main(String[] args) {
        MaquinaDeChicles maquinaDeChicles = new MaquinaDeChicles(2);

        System.out.println(maquinaDeChicles);

        maquinaDeChicles.ingresarMoneda();
        maquinaDeChicles.girarManivela();

        System.out.println(maquinaDeChicles);

        maquinaDeChicles.ingresarMoneda();
        maquinaDeChicles.girarManivela();

        System.out.println(maquinaDeChicles);

        maquinaDeChicles.ingresarMoneda();
        maquinaDeChicles.girarManivela();

        System.out.println(maquinaDeChicles);

        maquinaDeChicles.rellenar(5);

        System.out.println(maquinaDeChicles);

        maquinaDeChicles.ingresarMoneda();
        maquinaDeChicles.girarManivela();

        System.out.println(maquinaDeChicles);
    }
}