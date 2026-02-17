import java.util.Scanner;
// write a complete java program to test whether a given number is a hexadecimal number or not .if it is not ,an 
// exception  should  be  throwns  and  processed  by  the  program  .the  exception  must  be  userdefined    .the  numbere  
// must  be  assigned  to  string  variable.String  function  must  be  used  to  processing.irrespective  of  whether  the 
// number is a hexadecimal number or not the string Endingthe program must be printed on the screen.

public class hexadecimalDemo {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            String m = s.nextLine();
            boolean verify = false;
            for(int i=0;i<m.length();i++){
                char x = m.toUpperCase().charAt(i);
                verify = (Integer.valueOf(x)>=48 && Integer.valueOf(x)<=57) || (Integer.valueOf(x)>=65 && Integer.valueOf(x)<=70);
            }
            if(!verify){
                System.out.println("Not a valid hexadecimal");
            }
            else{
                System.out.println("A valid hexadecimal");
            }
            s.close();
        }
    }
}