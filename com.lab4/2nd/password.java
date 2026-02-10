import java.util.Scanner;
// We need to write the function to check the password entered is correct or not based on the 
// following conditions.
// a) It must have atleast one lower case character and one digit.
// b) It must not have any Upper case characters and any special characters
// c) length should be b/w 5-12.
// d) It should not have any same immediate patterns like
// abcanan1 : not acceptable coz of an an pattern
// abc11se: not acceptable, coz of pattern 11
// 123sd123 : acceptable, as not immediate pattern
// adfasdsdf : not acceptable, as no digits
// Aasdfasd12: not acceptable, as have uppercase character
public class password {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char m;
        boolean lower = false, digit = false;
        System.out.print("Enter the password : ");
        String pass = s.nextLine();
        if (pass.length() >= 5 && pass.length() <= 12) {
            for (int i = 0; i < pass.length(); i++) {
                m = pass.charAt(i);
                //lowercase check
                if ((Character.isLowerCase(m))) {
                    lower = true;
                }
                //special check
                if (!Character.isLetterOrDigit(m)) {
                    System.out.println(" Not acceptable, as it have an special character");
                    return;
                }
                //upper case check
                if (Character.isUpperCase(m)) {
                    System.out.println(" Not acceptable, as it have an uppercase character");
                    return;
                }
                //digit
                if (String.valueOf(m).matches("[0-9]")) {
                    digit = true;
                }
                //immediate pattern
                if (i < (pass.length() - 2) && (pass.charAt(i) == pass.charAt(i + 1))) {
                    System.out.println("Not acceptable, as it has a pattern");
                    return;
                }
                //repeting pattern
                if (i < pass.length() - 3 && pass.substring(i, i + 2).equals(pass.substring(i + 2, i + 4))) {
                    System.out.println("Not acceptable, repeating pattern");
                    return;
                }
            }
            if (!digit) {
                System.out.println("Not acceptable, as no digits");
                return;
            }
            if (!lower) {
                System.out.println(" Not acceptable, as it doesn't have an lower character");
            } else {
                System.out.println("It works");
            }
        }
        else{
            System.out.println("Enter a valid password");
        }
        s.close();
    }
}
