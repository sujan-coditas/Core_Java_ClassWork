package March_2023.Week1_01_march_2023.threadResource;

//class Mytask {
//     void executeTask() {
//        for(int i=0;i<=10;i++){
//            System.out.println("print ## : "+i+" -Printer2");
//        }    }
//}
class Mytask extends newClass implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("print ## : "+i+" -Printer2");
        }    }
}
class newClass{}
public class Example1 {
    public static void main(String[] args) {
        //Job 1
        System.out.println("== Application Started ==");

        //job 2
       // Mytask mytask=new Mytask();
//        mytask.executeTask();
       // mytask.start();

Mytask mytask=new Mytask();
Thread task=new Thread(mytask);
        task.start();

        //job 3
         for(int i=0;i<=10;i++){
             System.out.println("print # : "+i+" -Printer1");
         }

         //job 4
        System.out.println("== Application Finished ==");

    }
}
