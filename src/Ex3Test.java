import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;

public class Ex3Test {
    @Test
    public void test0 (){
        Object prime = Ex3.primeNumber(5);
        assertEquals(11, prime);
    }

    @Test
    public void test1 (){
        Object prime = Ex3.primeNumber(0);
        assertEquals("Invalied Iutput", prime);
    }

    @Test
    public void test2 (){
        Object prime = Ex3.primeNumber(100);
        assertEquals(541, prime);
    }

    @Test
    public void test3 (){
        Future <Object> prime = Ex3.asyncPrimeCal(300);
        Object result;
        try {
            result = prime.get();
            assertEquals(1987, result);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }

    @Test
    public void test4 (){
        Future <Object> prime = Ex3.asyncPrimeCal(300);
        Object result;
        try {
            result = prime.get();
            assertEquals(1987, result);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String currentThread = Thread.currentThread().getName();
        System.out.println("Main Thred should Run:" + currentThread);

    }
    
}
