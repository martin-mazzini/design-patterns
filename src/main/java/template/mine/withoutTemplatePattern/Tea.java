package template.mine.withoutTemplatePattern;

public class Tea {


    public void prepareRecipe () {
        boilWater();
        steppingTea();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println ("Boiling Water");
    }
    public void steppingTea() {
        System.out.println ("Steeping the tea");
    }
    public void pourInCup() {
        System.out.println ("Pouring into Cup");
    }
    public void addLemon() {
        System.out.println ("Adding lemon");
    }
}
