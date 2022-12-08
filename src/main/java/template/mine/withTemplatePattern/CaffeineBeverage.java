package template.mine.withTemplatePattern;

public abstract class CaffeineBeverage {

    /**
     * abstract steps must be implemented by every subclass
     * optional steps already have some default implementation, but still can be overridden if needed
     *  A hook is an optional step with an empty body.
     */

    /** Template method
     */
    public final void prepareRecipe () {

        //parte del template method
        boilWater();

        //obligatorio
        brew();

        //parte del template method
        pourInCup();

        //obligatorio
        addCondiments();

        //paso opcional
        finalStep();
    }

    public void finalStep(){};

    public final void boilWater() {
        System.out.println ("Boiling WATER");
    }

    abstract void brew();

    public final void pourInCup() {
        System.out.println ("Pouring into Cup");
    }

    abstract void addCondiments();
}
