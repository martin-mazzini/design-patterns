package template.mine.withTemplatePattern;

public class CoffeBeverage extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println ("Dripping coffee though filter");
    }

    @Override
    void addCondiments() {
        System.out.println ("Adding Sugar and Milk");
    }


    @Override
    public void finalStep() {
        System.out.println("Revolviendo cafe");
    }



}
