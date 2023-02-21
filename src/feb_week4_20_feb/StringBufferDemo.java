package feb_week4_20_feb;


class MutableStrings{
    public void display(){
        String name="Coditas";
        name.concat("Solutions");
        System.out.println("String : name : "+ name);

        StringBuffer stringBuffer= new StringBuffer("Kritis");
        stringBuffer.append("journey");
        System.out.println("String Buffer : "+ stringBuffer);
    }

    public void display2(){
        StringBuffer stringBuffer=new StringBuffer();
        System.out.println("Empty String Builder : "+stringBuffer.capacity());
        StringBuffer stringBuffer1=new StringBuffer("A");
        System.out.println("With one letter : "+stringBuffer1.capacity());
        stringBuffer1.ensureCapacity(26);
        System.out.println("Ensure Capacit size  :"+ stringBuffer1.capacity());



        // Methods:
        stringBuffer.append( "Sujan's Roll no is ");
        stringBuffer.append(121);
        System.out.println(stringBuffer);

        stringBuffer.replace(8,12,"id");
        System.out.println(stringBuffer);


    }


    //Methods :


}
public class StringBufferDemo {
    public static void main(String[] args) {
        MutableStrings mutableStrings= new MutableStrings();
        mutableStrings.display();
        mutableStrings.display2();

    }
}
