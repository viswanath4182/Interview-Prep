import java.util.concurrent.*;

public class ThreadCallable implements Callable<String> {

    String name;

    ThreadCallable(String name){
        this.name = name;

    }

    @Override
    public String call() throws Exception {
        return "my name is" + " " + name + Thread.currentThread().getName();
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadCallable task1 = new ThreadCallable("david");
        ThreadCallable task2 = new ThreadCallable("smith");


        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future1 = executorService.submit(task1);
        Future<String> future2 = executorService.submit(task2);

        String result1 = future1.get();
        String result2 = future2.get();

        System.out.println(result1 + " " + result2);





    }
}
