package feb_week4_20_feb;

import java.util.StringTokenizer;

class TokenDemo{
    public void display(){
        StringTokenizer stringTokenizer=new StringTokenizer("hii  How are u ?","are");
        while(stringTokenizer.hasMoreTokens()){
            System.out.print(stringTokenizer.nextToken());
        }

    }
}
public class StringTokenizerDemo {
    public static void main(String[] args) {
        TokenDemo tokenDemo= new TokenDemo();
        tokenDemo.display();

    }
}
