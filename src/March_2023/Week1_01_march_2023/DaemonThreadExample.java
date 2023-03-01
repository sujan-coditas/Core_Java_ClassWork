package March_2023.Week1_01_march_2023;
 class  DaaemonExample implements Runnable{

     @Override
     public void run() {
         System.out.println("Child Thread");
         System.out.println("priority of child "+Thread.currentThread().getPriority());
     }
 }
public class DaemonThreadExample {
    public static void main(String[] args) {
//        System.out.println("Main thread");
//        System.out.println("priority of parent "+Thread.currentThread().getPriority());

        DaaemonExample daaemonExample=new DaaemonExample();
        Thread thread=new Thread(daaemonExample);
        Thread thread1=new Thread(daaemonExample);


       thread.setPriority(11);
//        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread.start();


    }
}
