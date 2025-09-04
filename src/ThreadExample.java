public class ThreadExample implements Runnable {


    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        ThreadExample te = new ThreadExample();
        Thread t1 = new Thread(te);
        t1.start();

    }
}
