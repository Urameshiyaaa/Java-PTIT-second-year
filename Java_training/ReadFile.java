import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
  public static void main(String[] args){
    try {
      File myFile = new File("Hello.txt");
      Scanner readFile = new Scanner(myFile);
      while (readFile.hasNextLine()){
        String content = readFile.nextLine();
        System.out.println(content);
      }
      readFile.close();
    }
    catch (FileNotFoundException e){
      System.out.println("File lỗi");
      e.printStackTrace();
    }
  }
}