package singleton.mine;

public class Singleton {

    private static Singleton singleton;
    private Integer entero;

    private Singleton(Integer entero){
        this.entero = entero;
    };


    public static Singleton getInstance(Integer entero){
        if (singleton == null){
            singleton = new Singleton(entero);
            return singleton;
        }else{
            return singleton;
        }
    }





}
