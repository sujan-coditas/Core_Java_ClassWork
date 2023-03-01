package March_2023.Week1_01_march_2023.threadResource;
class RunnableInterface implements  Runnable{

    @Override
    public void run() {
        System.out.println("Thread creation using Runnable Interface");
    }
}
public class Method2 {
    public static void main(String[] args) {
        RunnableInterface runnableInterface= new RunnableInterface();
        Thread thread=new Thread(runnableInterface);
        thread.start();
    }
}
