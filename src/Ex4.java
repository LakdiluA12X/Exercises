import java.util.Scanner;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Ex4 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 2, 0, TimeUnit.MILLISECONDS, new SynchronousQueue<>());
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            String input = inputScanner.nextLine();
            if(input.equals("stop")){
                break;
            } else if (isInteger(input)) {
                int num = Integer.parseInt(input);
                threadExecute(num, executor);
            } else {
                System.out.println("Input is not executable.");
            }
        }

        inputScanner.close();
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }


    private static void threadExecute (int number, ThreadPoolExecutor executor) {
        try {
            executor.submit(()->{
                Object primeNum = Ex3.primeNumber(number);
                System.out.println(number+ "th Prime Number: "+ primeNum);
            });
        } catch (RejectedExecutionException e) {
            System.out.println("Cannot Execute: free Threads are not available.");
        }
    }

    private static boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
}
