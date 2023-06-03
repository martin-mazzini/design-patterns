package template.mine.withoutTemplatePattern;

import java.io.*;

public class Coffee extends BebidaInfusionada {


    public Coffee(String nombre) {
        super(nombre);
    }

    @Override
    protected void agregarCondimentos() {
        System.out.println("Agregar leche y azuc");
    }

    @Override
    protected void infusionar() {
        System.out.println("Filtrar el cafe");
    }
}
