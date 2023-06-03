package template.mine.withoutTemplatePattern;

public class Tea extends BebidaInfusionada {


    public Tea(String nombre) {
        super(nombre);
    }

    @Override
    protected void agregarCondimentos() {
        System.out.println("agregar limons");
    }

    @Override
    protected void infusionar() {
        System.out.println("poner el saquito");
    }
}
