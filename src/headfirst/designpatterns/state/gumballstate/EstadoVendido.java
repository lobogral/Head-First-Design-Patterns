package headfirst.designpatterns.state.gumballstate;

public class EstadoVendido extends Estado {

    public EstadoVendido(MaquinaDeChicles maquinaDeChicles) {
        this.maquinaDeChicles = maquinaDeChicles;
    }

    @Override
    public void ingresarMoneda() {
        System.out.println("Por favor espere, ya te estamos dando el chicle");
    }

    @Override
    public void expulsarMoneda() {
        System.out.println("Lo sentimos, ya giraste la manivela");
    }

    @Override
    public void girarManivela() {
        System.out.println("¡Girar la manivela 2 veces no te dara un chicle!");
    }

    @Override
    public void dispensar() {
        maquinaDeChicles.LanzamientoChicle();
        if (maquinaDeChicles.getNumeroChicles() > 0) {
            maquinaDeChicles.setEstado(new EstadoMonedaNoIngresada(maquinaDeChicles));
        } else {
            System.out.println("¡Oops, se agotaron los chicles!");
            maquinaDeChicles.setEstado(new EstadoAgotado(maquinaDeChicles));
        }
    }

    @Override
    public void rellenar() { }

    @Override
    public String toString() {
        return "dispensando un chicle";
    }
}