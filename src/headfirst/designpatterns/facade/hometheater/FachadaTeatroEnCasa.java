package headfirst.designpatterns.facade.hometheater;

public class FachadaTeatroEnCasa {

    Amplificador amplificador;
    Sintonizador sintonizador;
    ReproductorDVD reproductorDVD;
    ReproductorCD reproductorCD;
    Proyector proyector;
    LucesDeTeatro lucesDeTeatro;
    Pantalla pantalla;
    PalomitasDeMaiz palomitasDeMaiz;

    public FachadaTeatroEnCasa(Amplificador amplificador, 
                                 Sintonizador sintonizador, 
                                 ReproductorDVD reproductorDVD, 
                                 ReproductorCD reproductorCD, 
                                 Proyector proyector, 
                                 Pantalla pantalla,
                                 LucesDeTeatro lucesDeTeatro,
                                 PalomitasDeMaiz palomitasDeMaiz) {

        this.amplificador = amplificador;
        this.sintonizador = sintonizador;
        this.reproductorDVD = reproductorDVD;
        this.reproductorCD = reproductorCD;
        this.proyector = proyector;
        this.pantalla = pantalla;
        this.lucesDeTeatro = lucesDeTeatro;
        this.palomitasDeMaiz = palomitasDeMaiz;
    }

    public void verPelicula(String pelicula) {
        System.out.println("Preparate para ver una pelicula...");
        palomitasDeMaiz.encender();
        palomitasDeMaiz.pop();
        lucesDeTeatro.atenuacion(10);
        pantalla.bajar();
        proyector.encender();
        proyector.modoPantallaPanoramica();
        amplificador.encender();
        amplificador.setReproductorDVD(reproductorDVD);
        amplificador.setSonidoEnvolvente();
        amplificador.setVolumen(5);
        reproductorDVD.encender();
        reproductorDVD.reproducir(pelicula);
    }

    public void terminarPelicula() {
        System.out.println("Cerrando el teatro en casa...");
        palomitasDeMaiz.apagar();
        lucesDeTeatro.encender();
        pantalla.subir();
        proyector.apagar();
        amplificador.apagar();
        reproductorDVD.detener();
        reproductorDVD.expulsar();
        reproductorDVD.apagar();
    }

    public void leerReproductorCD(String cdTitle) {
        System.out.println("Prepárate para una experiencia audiófila...");
        lucesDeTeatro.encender();
        amplificador.encender();
        amplificador.setVolumen(5);
        amplificador.setReproductorCD(reproductorCD);
        amplificador.setSonidoEstereo();
        reproductorCD.encender();
        reproductorCD.reproducir(cdTitle);
    }

    public void apagarReproductorCd() {
        System.out.println("Apagando reproductor de CD...");
        amplificador.apagar();
        amplificador.setReproductorCD(reproductorCD);
        reproductorCD.expulsar();
        reproductorCD.apagar();
    }

    public void escucharRadio(double frecuencia) {
        System.out.println("Sintonizando las ondas...");
        sintonizador.encender();
        sintonizador.setFrecuencia(frecuencia);
        amplificador.encender();
        amplificador.setVolumen(5);
        amplificador.setSintonizador(sintonizador);
    }

    public void apagarRadio() {
        System.out.println("Apagando el sintonizador...");
        sintonizador.apagar();
        amplificador.apagar();
    }
}