import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercice01 {
    public static void main(String[] args) {
        try {
            File file =new File("fichier.txt");
            File sortie =new File("fichier_sortie.txt");
            FileWriter fw =new FileWriter(sortie);
            PrintWriter pw =new PrintWriter(fw);
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String text =scanner.nextLine();
                pw.println(text);
        }
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
