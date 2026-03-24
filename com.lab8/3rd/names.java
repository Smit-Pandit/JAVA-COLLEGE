import java.io.*;
import java.util.*;

public class names {
    public static void main(String[] args) {
        String path = "F:\\Smit\\COLLEGE\\JAVA-COLLEGE\\src\\com.lab8\\data\\names.txt";
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Enter 10 names:");
                try (Scanner sc = new Scanner(System.in);
                     FileWriter fw = new FileWriter(file)) {

                    for (int i = 0; i < 10; i++) {
                        fw.write(sc.nextLine() + "\n");
                    }
                }
            }
            ArrayList<String> names = new ArrayList<>();
            try (Scanner s = new Scanner(file)) {
                while (s.hasNextLine()) {
                    names.add(s.nextLine());
                }
            }
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);

                if (name.length() > 3) {
                    names.set(i, name.substring(3));
                } else {
                    names.set(i, "");
                }
            }
            Collections.sort(names);
            System.out.println("Processed Names:");
            for (String name : names) {
                System.out.println(name);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}