package headfirst.designpatterns.observer.weather;

public class VisorCondicionesNormales implements Observador {

    private final DatosClima datosClima;

    public VisorCondicionesNormales(DatosClima datosClima) {
        datosClima.agregarObservador(this);
        this.datosClima = datosClima;
    }

    @Override
    public void actualizar() {
        System.out.println("Condiciones normales: " 
                            + datosClima.getTemperatura()
                            + "°F y " 
                            + datosClima.getHumedad() 
                            + "% de humedad");
    }

}