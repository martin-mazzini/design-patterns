package template.mine.withTemplatePattern;



public class Client {

    public static void main(String[] args) {

        CoffeBeverage coffee = new CoffeBeverage();
        System.out.println("-----------------PREPARING COFFE--------------------");
        coffee.prepareRecipe();;

        System.out.println("------------------------PREPARING TEA---------------------");
        TeaBeverage tea = new TeaBeverage();
        tea.prepareRecipe();;


    }
}
