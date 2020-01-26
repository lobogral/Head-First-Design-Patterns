package headfirst.designpatterns.strategy.challenge;

public abstract class AplicacionCamaraDelCelular {

    EstrategiaParaCompartir estrategiaParaCompartir;

    public void setEstrategiaParaCompartir(EstrategiaParaCompartir ce) {
        this.estrategiaParaCompartir = ce;
    }

    public void compartir() {
        estrategiaParaCompartir.compartir();
    }

    public void tomar() {
        System.out.println("Tomando la foto");
    }

    public void guardar() {
        System.out.println("Guardando la foto");
    }

    public abstract void editar();
}