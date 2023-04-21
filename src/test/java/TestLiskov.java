import SOLID.LiskovSubstitutionPrinciple.ejemplo1.Rectangle;
import SOLID.LiskovSubstitutionPrinciple.ejemplo1.Resizer;
import SOLID.LiskovSubstitutionPrinciple.ejemplo1.Square;
import SOLID.LiskovSubstitutionPrinciple.ejemplo2.Calculadora;
import SOLID.LiskovSubstitutionPrinciple.ejemplo2.CalculadoraHija;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLiskov {



    @Test
    public void test(){



        Rectangle rectangle = new Rectangle(322344, 23432432);


        Resizer resizer = new Resizer();


        resizer.resizeToDefaultSize(rectangle);
        Assert.assertEquals(rectangle.getHeight(), 20);
        Assert.assertEquals(rectangle.getWidth(), 50);


        rectangle = new Square(40);

        resizer.resizeToDefaultSize(rectangle);
        Assert.assertEquals(rectangle.getHeight(), 20);
        Assert.assertEquals(rectangle.getWidth(), 50);


    }


    @Test
    public void test2(){
        Calculadora calculadora = new Calculadora();

        for (int i = -100; i < 100; i++) {
            try {
                calculadora.operar(i);
            }catch (Exception e){
                System.out.println("Test para calculadora failed for i = "+  i);
            }
        }



        calculadora = new CalculadoraHija();

        for (int i = -100; i < 100; i++) {
            try {
                calculadora.operar(i);
            }catch (Exception e){
                System.out.println("Test para calculadoraHija failed for i = "+  i);
            }
        }
    }






}
