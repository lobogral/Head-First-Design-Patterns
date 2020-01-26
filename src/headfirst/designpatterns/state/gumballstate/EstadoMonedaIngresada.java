package headfirst.designpatterns.state.gumballstate;

public class EstadoMonedaIngresada extends Estado {

    public EstadoMonedaIngresada(MaquinaDeChicles maquinaDeChicles) {
        this.maquinaDeChicles = maquinaDeChicles;
    }

    @Override
    public void ingresarMoneda() {
        System.out.println("No puedes ingresar otra moneda");
    }

    @Override
    public void expulsarMoneda() {
        System.out.println("Moneda devuelta");
        maquinaDeChicles.setEstado(new EstadoMonedaNoIngresada(maquinaDeChicles));
    }

    @Override
    public void girarManivela() {
        System.out.println("Has girado la manivela...");
        maquinaDeChicles.setEstado(new EstadoVendido(maquinaDeChicles));
    }

    @Override
    public void dispensar() {
        System.out.println("Chicle no dispensado");
    }

    @Override
    public void rellenar() { }

    @Override
    public String toString() {
        return "esperando a que gires la manivela";
    }
}