import java.io.File;
import java.util.Scanner;

public class Reading {

    public static void main(String[] args) {

         File file = new File("C:\\Users\\useruser\\Downloads\\Spring-Security-JWT-main\\File-handling\\test.txt");
         try {
             Scanner scanner = new Scanner(file);
             while (scanner.hasNextLine()) {
                 String text =scanner.nextLine();
                 System.out.println(text);
             }

         }catch (Exception e){
             e.printStackTrace();
         }



    }
}
