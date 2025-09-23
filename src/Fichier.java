import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fichier {

    public static void main(String[] args) throws Exception {

        File fichier = new File("monfichier.txt");

        FileWriter fw = new FileWriter(fichier);

        PrintWriter pw = new PrintWriter(fw);
        pw.println(123);
        pw.println(456);
        pw.println(789);
        pw.close();



    }
}
