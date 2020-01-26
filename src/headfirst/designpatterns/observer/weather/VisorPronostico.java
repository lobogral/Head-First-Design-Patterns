package headfirst.designpatterns.observer.weather;

public class VisorPronostico implements Observador {

    private float presionUsual = 29.92f;  
    private float ultimaPresion;
    private final DatosClima datosClima;

    public VisorPronostico(DatosClima datosClima) {
        datosClima.agregarObservador(this);
        this.datosClima = datosClima;
    }

    @Override
    public void actualizar() {
        ultimaPresion = presionUsual;
        presionUsual = datosClima.getPresion();
        System.out.print("Pronóstico: ");
        if (presionUsual > ultimaPresion) {
            System.out.println("Mejorando el clima en el camino!");
        } else if (presionUsual == ultimaPresion) {
            System.out.println("Mas de lo mismo");
        } else if (presionUsual < ultimaPresion) {
            System.out.println("Cuidado con el clima más frío y lluvioso");
        }
    }

}