package headfirst.designpatterns.observer.weather;

public class VisorEstadisticas implements Observador {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numLecturas;
    private final DatosClima datosClima;

    public VisorEstadisticas(DatosClima datosClima) {
        datosClima.agregarObservador(this);
        this.datosClima = datosClima;
    }

    @Override
    public void actualizar() {
        float temperatura = datosClima.getTemperatura();
        
        tempSum += temperatura;
        numLecturas++;

        if (temperatura > maxTemp) {
            maxTemp = temperatura;
        }

        if (temperatura < minTemp) {
            minTemp = temperatura;
        }

        System.out.println("Temperatura Prom/Max/Min = " + (tempSum / numLecturas)
                        + "/" + maxTemp + "/" + minTemp);
    }

}