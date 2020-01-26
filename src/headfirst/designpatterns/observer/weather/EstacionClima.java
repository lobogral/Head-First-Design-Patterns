package headfirst.designpatterns.observer.weather;

public class EstacionClima {

    public static void main(String[] args) {
        DatosClima datosClima = new DatosClima();

        VisorCondicionesNormales visorNormal = new VisorCondicionesNormales(datosClima);
        VisorEstadisticas visorEstadisticas = new VisorEstadisticas(datosClima);
        VisorPronostico visorPronostico = new VisorPronostico(datosClima);

        datosClima.cambioMedicion(80, 65, 30.4f);
        datosClima.cambioMedicion(82, 70, 29.2f);
        datosClima.cambioMedicion(78, 90, 29.2f);
    }

}