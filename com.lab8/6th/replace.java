import java.io.*;
import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        String path = "F:\\Smit\\COLLEGE\\JAVA-COLLEGE\\src\\com.lab8\\data\\sdj.txt";

        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            Scanner sc = new Scanner(file);
            StringBuilder fileTxt = new StringBuilder();

            while (sc.hasNextLine()) {
                fileTxt.append(sc.nextLine()).append("\n");
            }
            sc.close();

            String updatedTxt = fileTxt.toString().replaceAll("his", "her");
            FileWriter fw = new FileWriter(file);
            fw.write(updatedTxt);
            fw.close();

            System.out.println(updatedTxt);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}