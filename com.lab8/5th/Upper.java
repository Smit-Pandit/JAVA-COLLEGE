import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Upper{
    public static void main(String[] args) throws IOException {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter your message : ");
            String msg = s.nextLine();
            String upperMsg = msg.substring(0,1).toUpperCase() + msg.substring(1);
            System.out.println("message = " + upperMsg);
            try(FileWriter fw = new FileWriter("F:\\Smit\\COLLEGE\\JAVA-COLLEGE\\src\\com.lab8\\data\\5th.txt")){
                fw.write(upperMsg);
                fw.flush();
                fw.close();
            }catch(IOException e){
                System.out.println("Error : " + e.getMessage());
            }
            try(FileReader fr = new FileReader("F:\\Smit\\COLLEGE\\JAVA-COLLEGE\\src\\com.lab8\\data\\5th.txt")){
                char ch[] = new char[upperMsg.length()];
                fr.read(ch);
                System.out.println("Message from file : " + String.valueOf(ch));
                fr.close();
            }catch(IOException e){
                System.out.println("Error : " + e.getMessage());
            }
        }
    }
}