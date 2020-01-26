package headfirst.designpatterns.state.gumballstate;

public class MaquinaDeChicles {

    Estado estado;
    int numeroChicles = 0;

    public MaquinaDeChicles(int numeroChicles) {
        this.numeroChicles = numeroChicles;
        if (numeroChicles > 0) {
            estado = new EstadoMonedaNoIngresada(this);
        } else {
            estado = new EstadoAgotado(this);
        }
    }

    public void ingresarMoneda() {
        estado.ingresarMoneda();
    }

    public void expulsarMoneda() {
        estado.expulsarMoneda();
    }

    public void girarManivela() {
        estado.girarManivela();
        estado.dispensar();
    }

    void LanzamientoChicle() {
        System.out.println("Un chicle viene rodando por la ranura...");
        if (numeroChicles != 0) {
            numeroChicles = numeroChicles - 1;
        }
    }

    int getNumeroChicles() {
        return numeroChicles;
    }

    public void rellenar(int numeroChicles) {
        this.numeroChicles += numeroChicles;
        System.out.println("La máquina de chicles esta llena; el numero de chicles es: " + this.numeroChicles);
        estado.rellenar();
    }

    void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String result = "";
        result = result + "\nChicles Poderosos, Inc.";
        result = result + "\nModelo sobre Maquina de chicles habilitado para java #2019";
        result = result + "\nInventario: " + numeroChicles + " chicle";
        if (numeroChicles != 1) {
            result = result + "s";
        }
        result = result + "\n";
        result = result + "La maquina esta " + estado + "\n";
        return result;
    }
}