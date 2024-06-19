import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex3 {
    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            System.out.println("Main Thred:" + Thread.currentThread().getName());
            Future<Object> output = asyncPrimeCal(10000);
            System.out.println("Out:"+output);
            System.out.println("Prime Number:"+output.get());
            System.out.println("Time Taken: " + (System.currentTimeMillis()-startTime)/1000 + "s");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Object primeNumber(int number){
        try {
            Thread.sleep(20000); // Simulate heavy processing for 20 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        int numberOfPrimes = 1;
        int value = 2;
        if (number<=0){
            return "Invalied Iutput";
        }else{
            while (numberOfPrimes<=number) {
                if(numberOfPrimes==number){
                    break;
                }
                value++;
                for (int i = 2; i<=value; i++){
                    if (value%i==0){
                        if (value == i){
                            numberOfPrimes++;
                        }
                        break;
                    }
                }
                
            }
            return value;
        }
    }

    public static Future<Object> asyncPrimeCal (int n) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Object> task = () -> primeNumber(n);
        Future<Object> future = executor.submit(task);
        executor.shutdown();
        return future;
    }
}
