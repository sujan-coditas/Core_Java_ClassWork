package March_2023.Week1_01_march_2023;
class InterruptDemo implements Runnable{

    @Override
    public void run() {

        try
        { for(int i=1;i<10;i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
          }
        }
    }

public class InterruptMethod {
    public static void main(String[] args) {
        InterruptDemo interruptDemo=new InterruptDemo();
        Thread   thread=new Thread(interruptDemo);
        thread.start();
        thread.interrupt();
    }
}
