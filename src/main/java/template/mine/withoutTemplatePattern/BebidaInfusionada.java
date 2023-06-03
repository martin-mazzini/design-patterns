package template.mine.withoutTemplatePattern;

public abstract class BebidaInfusionada {

    private String nombre;

    public BebidaInfusionada(String nombre) {
        this.nombre = nombre;
    }

    public void prepareRecipe () {
        boilWater();
        infusionar();
        servir();
        agregarCondimentos();
    }

    protected abstract void agregarCondimentos();

    protected abstract void infusionar();

    private void boilWater() {
        System.out.println ("Boiling Water");
    }
    private void servir() {
        System.out.println ("Pouring into Cup");
        System.out.println(nombre);
    }




}
