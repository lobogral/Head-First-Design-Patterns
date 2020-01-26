package headfirst.designpatterns.strategy.challenge;

import java.util.Scanner;

public class FotoConCelular {

    public static void main(String[] args) {

        AplicacionCamaraDelCelular aplicacionCamara = new AplicacionCamaraBasica();
        String estrategiaParaCompartir = getEstrategiaParaCompartir();
        switch (estrategiaParaCompartir) {
            case("t"): aplicacionCamara.setEstrategiaParaCompartir(new Texteo()); break;
            case("ce"): aplicacionCamara.setEstrategiaParaCompartir(new CorreoElectronico()); break;
            case("rs"): aplicacionCamara.setEstrategiaParaCompartir(new RedSocial()); break;
            default: aplicacionCamara.setEstrategiaParaCompartir(new Texteo());
        }
        aplicacionCamara.tomar();
        aplicacionCamara.editar();
        aplicacionCamara.guardar();
        aplicacionCamara.compartir();
    }

    public static String getEstrategiaParaCompartir() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Compartir por texto (t), correo electronico (ce), o red social (rs)?");
        String appName = escaner.next();
        escaner.close();
        return appName;
    }
}