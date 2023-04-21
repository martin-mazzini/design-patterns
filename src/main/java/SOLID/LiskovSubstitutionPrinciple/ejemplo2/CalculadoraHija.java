package SOLID.LiskovSubstitutionPrinciple.ejemplo2;

public class CalculadoraHija extends Calculadora {



    public int operar(Integer a){
        return (22 * 100) / a;
    }
}
