import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Exercice03 {

    public static void main(String[] args) {
        try {
            File file = new File("ex03.txt");
            File result = new File("result.txt");
            FileWriter fw = new FileWriter(result);
            PrintWriter pw = new PrintWriter(fw);
            Scanner scanner = new Scanner(file);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a word to search:");
            String word = sc.nextLine();
            int count = 0;
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                int index = 0;
                while ((index = line.indexOf(word, index)) != -1) {
                    count++;
                    index += word.length();
                }

            }
            pw.println("the word " + word + " appears " + count + " times");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}