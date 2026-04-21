import java.io.*;
import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        try {
            Scanner sm = new Scanner(System.in);
            File f = new File("F:\\Smit\\COLLEGE\\JAVA-COLLEGE\\src\\com.lab8\\data\\new.txt");

            if (!f.exists()) {
                f.createNewFile();
                System.out.println("Enter a String:");
                String m = sm.nextLine();
                try (FileWriter fw = new FileWriter(f)) {
                    fw.write(m);
                    fw.flush();
                }
                sm.close();
            }
            try (Scanner sc = new Scanner(f)) {
                if (sc.hasNextLine()) {
                    String text = sc.nextLine();

                    int first = text.indexOf("the");
                    int last = text.lastIndexOf("the");

                    if (first != -1 && last != -1 && first != last) {
                        String wantedTxt = text.substring(first + 3, last);
                        System.out.println(first);
                        System.out.println(last);
                        System.out.println(wantedTxt);
                    } else {
                        System.out.println("'the' does not occur twice.");
                    }
                } else {
                    System.out.println("File is empty.");
                }
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}