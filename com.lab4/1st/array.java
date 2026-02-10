
import java.util.Scanner;

class MatrixHandler {
    int w,h,d;

    MatrixHandler(int w, int h, int d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    void set(int value, int x, int y, int z, int[] array1D) {
        int i = x + (y * w) + (z * w * h);
        array1D[i] = value;
    }

    int get(int x, int y, int z, int[] array1D) {
        int i = x + (y * w) + (z * w * h);
        return array1D[i];
    }

    int getTotalSize() {
        return w * h * d * 3;
    }
}


public class array {
    public static void main(String[] args) {
        int w = 3, h = 3, d = 3;
        MatrixHandler handler = new MatrixHandler(w, h, d);
        int[] arr = new int[handler.getTotalSize()];
        System.out.println("Enter your number : ");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println("Enter x,y,z");
        System.out.print("x : ");
        int x = s.nextInt();
        System.out.print("y : ");
        int y = s.nextInt();
        System.out.print("z : ");
        int z = s.nextInt();
        System.out.println("Storing "+ m);
        handler.set(m, x, y, z, arr);

        int result = handler.get(x, y, z, arr);
        
        System.out.println("Retrieved value: " + result);
        

        System.out.println("The value is physically at memory ("+x+","+y+","+z+") is "  + arr[x + (y * w) + (z * w * h)]);
    }
}