package template.mine.withoutTemplatePattern;

public class Client {

    public static void main(String[] args) {


        //Tenemos dos clases que producen bebidas  (te, cafe)
        //En el futuro podriamos llegar a querer agregar otras mas (mate, otros tipos de cafe)
        //Todas las recetas siguen los mismos pasos
        //Que problemas tiene el codigo actual?

        //Prestar atencion a
        //Duplicacion de codigo o reusabilidad de codigo
        //Open closed
        //Consistencia en el orden de operaciones y posiblidad de introducir bugs
        //Facilidad de extender el codigo


        BebidaInfusionada bebidaInfusionada = new Tea("te");
        Coffee coffee = new Coffee("cafe");
        System.out.println("----------------------PREPARING COFFE--------------------------");
        coffee.prepareRecipe();;

        System.out.println("----------------------------PREPARING TEA------------------------------");
        Tea tea = new Tea("te");
        tea.prepareRecipe();;


    }
}
