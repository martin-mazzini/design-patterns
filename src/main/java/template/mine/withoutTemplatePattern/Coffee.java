package template.mine.withoutTemplatePattern;

import java.io.*;

public class Coffee {



    public void prepareRecipe () {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println ("Boiling WATER");
    }
    public void brewCoffeeGrinds() {System.out.println ("Dripping coffee though filter");}
    public void pourInCup() {
        System.out.println ("Pouring into Cup");
    }
    public void addSugarAndMilk() {
        System.out.println ("Adding Sugar and Milk");
    }
}
