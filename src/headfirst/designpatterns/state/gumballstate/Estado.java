package headfirst.designpatterns.state.gumballstate;

public abstract class Estado {

    MaquinaDeChicles maquinaDeChicles;

    public abstract void ingresarMoneda();
    public abstract void expulsarMoneda();
    public abstract void girarManivela();
    public abstract void dispensar();
    public abstract void rellenar();
}