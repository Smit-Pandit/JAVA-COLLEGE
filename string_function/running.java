
import java.util.Scanner;

public class running {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            Std x = new Std();

            System.out.println("Enter a name:");
            String f = s.nextLine();
            char[] m = f.toCharArray();
            System.out.println("The length is : " + x.length(m));
            char[] t = x.add(m, 3, 'e');
            for (int i = 0; i < t.length; i++) {
                System.out.println(t[i]);
            }
            s.close();
        }
    }
}
