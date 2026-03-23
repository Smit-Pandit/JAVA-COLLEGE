
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            File f = new File("F:\\Smit\\COLLEGE\\JAVA-COLLEGE\\src\\com.lab8\\data", "2nd.txt");
            f.createNewFile();
            System.out.println("Enter your message : ");
            String msg = s.nextLine();
            try (FileWriter fw = new FileWriter(f)) {
                fw.write(msg);
                fw.flush();
                fw.close();
            } catch (IOException e) {
                e.getMessage();
            }
            char[] ms = new char[msg.length()];
            try (FileReader fr = new FileReader("F:\\Smit\\COLLEGE\\JAVA-COLLEGE\\src\\com.lab8\\data\\2nd.txt")) {
                fr.read(ms);
                fr.close();
            }
            for (int i = 0; i < ms.length; i++) {
                if (ms[i] == 'a' || ms[i] == 'e' || ms[i] == 'i' || ms[i] == 'o' || ms[i] == 'u') {
                    System.out.printf("%d : %c\n", i + 1, ms[i]);
                }
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
