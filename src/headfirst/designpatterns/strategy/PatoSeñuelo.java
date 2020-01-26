package headfirst.designpatterns.strategy;

public class PatoSeñuelo extends Pato {

    public PatoSeñuelo() {
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        setComportamientoVuelo(new VolarImposible());
        setComportamientoCua(new CuaSilencioso());
    }

    @Override
    public void mostrar() {
        System.out.println("Soy un pato señuelo");
    }
}