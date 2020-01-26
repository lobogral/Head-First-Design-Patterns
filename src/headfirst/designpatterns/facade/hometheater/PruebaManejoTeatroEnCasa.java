package headfirst.designpatterns.facade.hometheater;

public class PruebaManejoTeatroEnCasa {
    
    public static void main(String[] args) {
        Amplificador amp = new Amplificador("Amplificador Top-O-Line");
        Sintonizador tuner = new Sintonizador("Sintonizador AM/FM Top-O-Line", amp);
        ReproductorDVD dvd = new ReproductorDVD("Reproductor DVD Top-O-Line", amp);
        ReproductorCD cd = new ReproductorCD("Reproductor CD Top-O-Line", amp);
        Proyector projector = new Proyector("Proyector Top-O-Line", dvd);
        LucesDeTeatro lights = new LucesDeTeatro("Luces del techo del teatro");
        Pantalla screen = new Pantalla("Pantalla del teatro");
        PalomitasDeMaiz popper = new PalomitasDeMaiz("Maquina de palomitas");

        FachadaTeatroEnCasa teatroEnCasa = 
                new FachadaTeatroEnCasa(amp, tuner, dvd, cd, 
                                        projector, screen, lights, popper);

        teatroEnCasa.verPelicula("En busca del arca perdida");
        teatroEnCasa.terminarPelicula();
    }
}