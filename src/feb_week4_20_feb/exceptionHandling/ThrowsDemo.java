package feb_week4_20_feb.exceptionHandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Demo{
    public void show() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("abcd.text");
    }
    public void show1()   {
        try {
            FileInputStream fileInputStream=new FileInputStream("abcd.text");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Demo demo=new Demo();
        demo.show1();
    }
}
