package March_2023.Week1_01_march_2023;


class JoinDemo implements Runnable{

    @Override
    public void run() {
         for(int i=1;i<11;i++){
             System.out.println(Thread.currentThread().getName()+" "+ i);

             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }

    }
}

class JoinDemo1   implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + " " + (i+10));
        }
    }
}
public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo joinDemo=new JoinDemo();
        JoinDemo1 joinDemo1= new JoinDemo1();
        Thread thread=new Thread(joinDemo);
        Thread thread1=new Thread(joinDemo1);
         thread.start();
         thread1.join();
         thread1.start();


    }
}
