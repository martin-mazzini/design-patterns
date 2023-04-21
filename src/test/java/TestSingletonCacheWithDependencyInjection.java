import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import singleton.cachewithdependencyinjection.Cache;
import singleton.cachewithdependencyinjection.StringProcessor;


public class TestSingletonCacheWithDependencyInjection {



        @Test
        public void testStringProcessor(){
            Cache cacheMock = Mockito.mock(Cache.class);
            Mockito.when(cacheMock.getFromCache("hola")).thenReturn(10);

            StringProcessor stringProcessor = new StringProcessor(cacheMock);
            int result = stringProcessor.processKey("hola");

            Assert.assertEquals(result, 30);
        }

}
