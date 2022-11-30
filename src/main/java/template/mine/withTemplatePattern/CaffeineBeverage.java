package template.mine.withTemplatePattern;

public abstract class CaffeineBeverage {

    /**
     * abstract steps must be implemented by every subclass
     * optional steps already have some default implementation, but still can be overridden if needed
     *  A hook is an optional step with an empty body.
     */

    public void prepareRecipe () {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        finalStep();
    }

    public void finalStep() {}


    public void boilWater() {
        System.out.println ("Boiling Water");
    }

    abstract void brew();

    public void pourInCup() {
        System.out.println ("Pouring into Cup");
    }

    abstract void addCondiments();
}
