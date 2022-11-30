package template.mine.withTemplatePattern;

public class TeaBeverage extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println ("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println ("Adding lemon");
    }


}
