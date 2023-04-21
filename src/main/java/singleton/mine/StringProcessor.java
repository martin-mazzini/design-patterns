package singleton.mine;



public class StringProcessor {

    public int processKey(String key){
        SingletonCache instance = SingletonCache.getInstance();
        return instance.getFromCache(key) * 2 + 10;
    }

}
