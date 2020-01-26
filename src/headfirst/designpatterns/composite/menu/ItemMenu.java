package headfirst.designpatterns.composite.menu;

public class ItemMenu extends ComponenteMenu {

    private final boolean vegetariano;
    private final double precio;

    public ItemMenu(String nombre, String descripcion, boolean vegetariano, double precio){ 
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.vegetariano = vegetariano;
        this.precio = precio;
    }

    @Override
    public void imprimir() {
        System.out.print("  " + nombre);
        if (vegetariano) {
            System.out.print("(v)");
        }
        System.out.println(", " + precio);
        System.out.println("     -- " + descripcion);
    }
}
