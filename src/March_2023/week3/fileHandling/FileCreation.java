package March_2023.week3.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class CreatingFile{
  public void createFile(){
      File file =new File("abc.txt");
      try {
          if(file.createNewFile()){
              System.out.println("File created : "+ file.getName());
          }
          else {
              System.out.println("File Exists ");
          }
      } catch (IOException e) {
          throw new RuntimeException(e);
      }

  }
}

class FileWriting{
    public void fileWriting() {
        FileWriter writer = null;
        try {
            writer = new FileWriter("abc.txt");
            writer.append("\n hey this line was added in writer");
            writer.close();
            System.out.println("Written Successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

class ReadingFile{
    public void readFile()  {
        File readFile=new File ("abc.txt");
        Scanner Reader= null;
        try {
            Reader = new Scanner(readFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(Reader.hasNextLine()){
            System.out.println(Reader.nextLine());
        }
        Reader.close();
    }
}
public class FileCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean Exit=false;

       while(!Exit){
           System.out.println("\n 0 EXIT \n 1. create file \n 2. read file \n 3. ");
           int choice= sc.nextInt();

           switch (choice){
               case 0:
                   Exit=true;
                   break;
               case 1:
                   CreatingFile creatingFile=new CreatingFile();
                   creatingFile.createFile();
                   break;

               case 2:
                    ReadingFile readingFile=new ReadingFile();
                    readingFile.readFile();
                    break;


               case 3:
                   FileWriting fileWrite= new FileWriting();
                   fileWrite.fileWriting();
                   break;

               default:
                   System.out.println("enter valid option");
                   break;

           }
       }
    }
}
