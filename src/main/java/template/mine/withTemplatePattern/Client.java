package template.mine.withoutTemplatePattern;

import template.mine.withoutTemplatePattern.Coffee;
import template.mine.withoutTemplatePattern.Tea;

public class Client {

    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();;

        Tea tea = new Tea();
        tea.prepareRecipe();;


    }
}
