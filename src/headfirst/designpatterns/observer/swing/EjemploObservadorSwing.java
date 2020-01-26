package headfirst.designpatterns.observer.swing;

import java.awt.*;
import javax.swing.*;

public class EjemploObservadorSwing {

    JFrame ventana;

    public static void main(String[] args) {
        EjemploObservadorSwing ejemplo = new EjemploObservadorSwing();
        ejemplo.ir();
    }

    public void ir() {
        ventana = new JFrame();

        JButton button = new JButton("¿Deberia hacerlo?");

        button.addActionListener(event -> 
            System.out.println("El angel dice: ¡No lo hagas, podrias arrepentirte!")
        );
        button.addActionListener(event ->
            System.out.println("El demonio dice: ¡Vamos, hazlo!")
        );
        ventana.getContentPane().add(BorderLayout.CENTER, button);

        // Estableciendo propiedades de la ventana 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().add(BorderLayout.CENTER, button);
        ventana.setBounds(100,100,200,100);
        ventana.setVisible(true);
    }

}