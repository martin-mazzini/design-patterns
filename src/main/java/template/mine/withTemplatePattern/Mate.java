package template.mine.withTemplatePattern;

public class Mate extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Poniendo el agua en la yerba");
    }

    @Override
    void addCondiments() {
        System.out.println("Poniendo azucar");
    }
}
