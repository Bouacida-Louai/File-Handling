import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fichier {

    public static void main(String[] args) throws Exception {


   ecrireDansFichier("test.txt","Bonjour",true);
   ecrireDansFichier("test.txt","hello world",true);
    }


    public static void ecrireDansFichier(String Fichier, String texte,boolean ajoute) {
    try {
    File f =new File(Fichier);
    FileWriter fw = null;
    fw = new FileWriter(f,ajoute);
    PrintWriter pw =new PrintWriter(fw);
    pw.println(texte);
    pw.close();
    }
    catch (IOException e){
       e.printStackTrace();
    }

    }



}

