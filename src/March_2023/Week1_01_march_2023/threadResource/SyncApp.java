package March_2023.Week1_01_march_2023.threadResource;

class Printer{
    void printDocuments(int numOfCopies,String docName){
        for(int i=1;i<=numOfCopies;i++){
            System.out.println(">>Printing "+docName+" "+i);
        }
    }
}

class MyThread extends Thread{
    Printer pRef;

    MyThread(Printer p){
        this.pRef = p;
    }

    public void run(){
        synchronized (this){
            pRef.printDocuments(10,"Sujan's Doc");
        }

    }
}

class YourThread extends Thread{
    Printer pRef;

    YourThread(Printer p){
        this.pRef = p;
    }

    public void run(){
        synchronized (this){
            pRef.printDocuments(10,"Tanmay's Doc");
        }
    }
}

public class SyncApp {
    public static void main(String[] args) {
        System.out.println("=====Application Started=====");

        Printer printer = new Printer();


        MyThread mRef = new MyThread(printer);
        YourThread yRef = new YourThread(printer);

        mRef.start();
        yRef.start();

        System.out.println("=====Application Ended=====");
    }
}
/*=====Application Started=====
=====Application Ended=====
>>Printing Sujan's Doc 1
>>Printing Sujan's Doc 2
>>Printing Tanmay's Doc 1
>>Printing Tanmay's Doc 2
>>Printing Tanmay's Doc 3
>>Printing Tanmay's Doc 4
>>Printing Tanmay's Doc 5
>>Printing Tanmay's Doc 6
>>Printing Tanmay's Doc 7
>>Printing Tanmay's Doc 8
>>Printing Tanmay's Doc 9
>>Printing Tanmay's Doc 10
>>Printing Sujan's Doc 3
>>Printing Sujan's Doc 4
>>Printing Sujan's Doc 5
>>Printing Sujan's Doc 6
>>Printing Sujan's Doc 7
>>Printing Sujan's Doc 8
>>Printing Sujan's Doc 9
>>Printing Sujan's Doc 10

Process finished with exit code 0*/