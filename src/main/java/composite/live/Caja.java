package composite.live;

import java.util.ArrayList;
import java.util.List;
//composite
public class Caja implements Component{


    private List<Component> componentList;
    private String nombreDeLaCaja;

    public Caja(List<Component> componentList) {
        this.componentList = componentList;
    }

    public Caja(){
        componentList = new ArrayList<>();
    }

    public Caja(String cajaRaiz) {
        this.nombreDeLaCaja = cajaRaiz;
        componentList = new ArrayList<>();
    }

    @Override
    public int getPrice() {
        int sum = 0;
        System.out.println("Calculando precio de la caja: " + nombreDeLaCaja);
        for (Component component: componentList){
            sum += component.getPrice();
        }
        System.out.println("Precio de la caja " + nombreDeLaCaja + " igual a: " + sum);
        return sum;
    }

    public void addComponent(Component component){
        componentList.add(component);
    }
}
