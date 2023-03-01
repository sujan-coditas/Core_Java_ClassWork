package feb_week5_27_feb.feb_28;

class SimpleDemo extends  Thread {
    // after calling start() control comes here and thread lifecycle begins from this point
    public void run() {
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("current thread : " + Thread.currentThread());
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
         SimpleDemo simpleDemo= new SimpleDemo();
        SimpleDemo simpleDemo1= new SimpleDemo();
        SimpleDemo simpleDemo2= new SimpleDemo();


        simpleDemo.setName("A");
        simpleDemo1.setName("B");
        simpleDemo2.setName("C");

        simpleDemo.setDaemon(true);

        simpleDemo.start();
        simpleDemo1.start();
        simpleDemo2.start();

        System.out.println("before starting thread isAlive: "+simpleDemo.isAlive());
        simpleDemo.start();//it will call run() implicitly
        System.out.println("After starting thread isAlive: "+simpleDemo.isAlive());
        /*=====thread alive==========
        * before starting thread isAlive: false
After starting thread isAlive: true
current thread : Thread[A,5,main]
current thread : Thread[A,5,main]
current thread : Thread[A,5,main]
current thread : Thread[A,5,main]
current thread : Thread[A,5,main]
* */

        System.out.println("Current state of A "+simpleDemo1.getState());
        /* State  of current thread RUNNABLE  */




    }
}
