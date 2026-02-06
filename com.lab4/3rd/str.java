
import java.util.Scanner;
// A string is entered like aabcdeaabcjlkjerwlaaabbsadfdsf...
// And you have to print those characters which exceed a given no. n entered by user.

public class str {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter n : ");
            int n = s.nextInt();
            int x;
            s.nextLine();
            System.out.print("Enter the string : ");
            String str = s.nextLine();
            char[] a = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                x = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (a[i] == a[j]) {
                        x++;
                    }
                }
                if (x >= n) {
                    System.out.println(a[i] + " exceeds the limit");
                    return;
                }
            }
            System.out.println("All Good");
            s.close();
        }
        catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
