package singleton.cachewithdependencyinjection;

import java.util.HashMap;

public class Cache {

    private HashMap<String, Integer> map = new HashMap<>();
    public Integer getFromCache(String key){
        return map.get(key);
    }





}
