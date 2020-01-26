package headfirst.designpatterns.composite.menu;

public class Mesero {

    private final ComponenteMenu todosLosMenus;

    public Mesero(ComponenteMenu todosLosMenus) {
        this.todosLosMenus = todosLosMenus;
    }

    public void imprimirMenu() {
        todosLosMenus.imprimir();
    }

}