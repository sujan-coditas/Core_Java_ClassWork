package March_2023.Week1_01_march_2023;

class RunnableThreadMethods implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
       // System.out.println("run is Alive before start: " + Thread.currentThread().isAlive());
        //Thread.currentThread().setName("sujan");
        //System.out.println(100/0);
        System.out.println("Run() of current thread is : "+Thread.currentThread().getName());
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        RunnableThreadMethods runnableThreadMethods= new RunnableThreadMethods();
        Thread thread= new Thread(runnableThreadMethods);
      //  Thread thread1=new Thread(runnableThreadMethods);
        System.out.println("run isAlive before start: " + thread.isAlive());


        thread.start();
        // thread1.start();

        System.out.println("thread isAlive after start: " + thread.isAlive());

        System.out.println("Thread name in main: "+ Thread.currentThread().getName());
    }
}
