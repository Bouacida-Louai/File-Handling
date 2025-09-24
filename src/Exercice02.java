import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercice02 {
    public static void main(String[] args) {

        File entree = new File("int1.txt");
        File sortie = new File("int2.txt");
        try{
            FileWriter fw =new FileWriter(sortie);
            PrintWriter pw =new PrintWriter(fw);
            Scanner scanner =new Scanner(entree);
            while (scanner.hasNextInt()){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                pw.println(a+b);
            }
            pw.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
