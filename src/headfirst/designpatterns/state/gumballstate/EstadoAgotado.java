package headfirst.designpatterns.state.gumballstate;

public class EstadoAgotado extends Estado {

    public EstadoAgotado(MaquinaDeChicles maquinaDeChicles) {
        this.maquinaDeChicles = maquinaDeChicles;
    }

    @Override
    public void ingresarMoneda() {
        System.out.println("No puedes ingresar la moneda, los chicles se agotaron");
    }

    @Override
    public void expulsarMoneda() {
        System.out.println("No puedes expulsar la modena porque no la has ingresado");
    }

    @Override
    public void girarManivela() {
        System.out.println("Giraste la manivela, pero los chicles se agotaron");
    }

    @Override
    public void dispensar() {
        System.out.println("No hay chicles dispensados");
    }

    @Override
    public void rellenar() { 
        maquinaDeChicles.setEstado(new EstadoMonedaNoIngresada(maquinaDeChicles));
    }

    @Override
    public String toString() {
        return "agotada";
    }
}