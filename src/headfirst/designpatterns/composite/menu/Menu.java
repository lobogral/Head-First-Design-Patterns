package headfirst.designpatterns.composite.menu;

import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends ComponenteMenu {

    private final ArrayList<ComponenteMenu> componentesMenu;

    public Menu(String nombre, String descripcion) {
        componentesMenu = new ArrayList<>();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void agregar(ComponenteMenu componenteMenu) {
        componentesMenu.add(componenteMenu);
    }

    public void remover(ComponenteMenu componenteMenu) {
        componentesMenu.remove(componenteMenu);
    }

    public ComponenteMenu getHijo(int i) {
        return (ComponenteMenu) componentesMenu.get(i);
    }

    @Override
    public void imprimir() {
        System.out.print("\n" + nombre);
        System.out.println(", " + descripcion);
        System.out.println("---------------------");

        Iterator<ComponenteMenu> iterator = componentesMenu.iterator();
        while (iterator.hasNext()) {
            ComponenteMenu menuComponent = iterator.next();
            menuComponent.imprimir();
        }
    }

}