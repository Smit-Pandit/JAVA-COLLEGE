
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Upper {

    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            File f = new File("C:\\project\\new\\JAVA-COLLEGE\\com.lab8\\temp\\1st.txt");
            if (f.isFile()) {
                System.out.println("connected...");
            } else {
                throw new IOException("Well that was easy");
            }
            System.out.println("Enter the String : ");
            String msg = s.nextLine();
            try (FileWriter fw = new FileWriter(f)) {
                fw.write(msg);
                fw.flush();
                if(fw!=null){
                    fw.close();
                }
            }catch(IOException e){
                e.getMessage();
            }
            char[] m = new char[msg.length()];
            try(FileReader fr = new FileReader(f)){
                fr.read(m);
            }
        }
    }
}
