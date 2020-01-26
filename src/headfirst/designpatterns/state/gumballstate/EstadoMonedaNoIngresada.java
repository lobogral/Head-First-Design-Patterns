package headfirst.designpatterns.state.gumballstate;

public class EstadoMonedaNoIngresada extends Estado {

    public EstadoMonedaNoIngresada(MaquinaDeChicles maquinaDeChicles) {
        this.maquinaDeChicles = maquinaDeChicles;
    }

    @Override
    public void ingresarMoneda() {
        System.out.println("Ya ingresaste una moneda");
        maquinaDeChicles.setEstado(new EstadoMonedaIngresada(maquinaDeChicles));
    }

    @Override
    public void expulsarMoneda() {
        System.out.println("No tienes una moneda ingresada");
    }

    @Override
    public void girarManivela() {
        System.out.println("Giraste la manivela, pero aqui no hay una moneda");
    }

    @Override
    public void dispensar() {
        System.out.println("Necesitas pagar primero");
    } 

    @Override
    public void rellenar() { }

    @Override
    public String toString() {
        return "esperando por una moneda";
    }
}
