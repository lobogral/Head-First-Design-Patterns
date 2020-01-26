package headfirst.designpatterns.decorator.pizza;

public class Pizzeria {

    public static void main(String args[]) {
        Pizza cortezaDelgada = new CortezaDelgada();
        Pizza cortezaDelgadaConQueso = new Queso(cortezaDelgada);
        Pizza pizzaGriega = new Aceitunas(cortezaDelgadaConQueso);

        System.out.println(pizzaGriega.getDescripcion() 
                + " $" + String.format("%.2f", pizzaGriega.costo()));
    }

}