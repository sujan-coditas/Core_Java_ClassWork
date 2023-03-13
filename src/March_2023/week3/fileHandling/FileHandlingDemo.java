package March_2023.week3.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) throws IOException {

        //Read file
//        File file=new File("abc.txt");
//        if(file.exists()){
//            System.out.println("file is present at location");
//        }
//        else {
//            System.out.println("file doesnot present at location");
//            file.createNewFile();
//            System.out.println("File created");
//
//        }
//
//        System.out.println("Read file ?  "+file.canRead());
//        System.out.println("Write file ?  "+file.canWrite());
//        System.out.println("File absolute path : "+ file.getAbsolutePath());
//        System.out.println("cananical pqth : "+  file.getCanonicalPath());
//        System.out.println(file);

//        FileWriter fileWriter= new FileWriter("abc.txt");
//        fileWriter.write("Hello this is Sujan ");
//        fileWriter.close();

        FileReader fileReader=new FileReader("abc.txt");
        fileReader.close();

    }

}
