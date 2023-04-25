package composite.live2;



import java.util.ArrayList;
import java.util.List;

public class Caja implements Nodo{

    public List<Nodo> hijos = new ArrayList<>();

    public Caja(){}

    @Override
    public int getPrice() {
        int sum = 0;
        for (Nodo nodo: hijos){
            sum = sum + nodo.getPrice();
        }
        return sum;
    }

    public void addNode(Nodo nodo){
        hijos.add(nodo);
    }


}
