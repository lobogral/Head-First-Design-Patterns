package headfirst.designpatterns.observer.weather;

public class DatosClima extends Observable {

    private float temperatura;
    private float humedad;
    private float presion;

    public DatosClima() {
        super();
    }

    public void cambioMedicion(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        avisarObservadores();
    }

    public float getTemperatura(){
        return temperatura;
    }

    public float getHumedad(){
        return humedad;
    }

    public float getPresion(){
        return presion;
    }

}