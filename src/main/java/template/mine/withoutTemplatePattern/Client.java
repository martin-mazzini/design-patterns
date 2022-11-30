package template.mine.withoutTemplatePattern;

public class Client {

    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        System.out.println("----------------------PREPARING COFFE--------------------------");
        coffee.prepareRecipe();;

        System.out.println("----------------------------PREPARING TEA------------------------------");
        Tea tea = new Tea();
        tea.prepareRecipe();;


    }
}
