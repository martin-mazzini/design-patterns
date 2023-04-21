package singleton.mine;

import java.util.HashMap;

public class SingletonCache {

    private HashMap<String, Integer> map = new HashMap<>();


    private SingletonCache(){};
    private static SingletonCache singleton;

    public static SingletonCache getInstance(){
        if (singleton == null){
            singleton = new SingletonCache();
            return singleton;
        }else{
            return singleton;
        }
    }

    public Integer getFromCache(String key){
        return map.get(key);
    }





}
