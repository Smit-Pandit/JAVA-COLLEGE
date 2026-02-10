import java.util.Arrays;

public class Std {
    // int arrn[];
    public int length(char arr[]){
        return arr.length;
    }
    public char[] add(char arr[],int at,char value){
        int i;
        char []anew = Arrays.copyOf(arr, length(arr)+1);
        int l=arr.length;
        for(i=l;i>at;i--){
            anew[i] = arr[i-1];
        }
        anew[i] = value;
        return anew;
    }
}
