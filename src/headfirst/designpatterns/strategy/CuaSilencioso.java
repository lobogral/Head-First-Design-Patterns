package headfirst.designpatterns.strategy;

public class CuaSilencioso implements ComportamientoCua {

    @Override
    public void cua() {
        System.out.println("<< Silencio >>");
    }
}