package singleton.cachewithdependencyinjection;


public class StringProcessor {

    private Cache cache;

    public StringProcessor(Cache cache){
        this.cache = cache;
    }

    public int processKey(String key){
        return cache.getFromCache(key) * 2 + 10;
    }

}
