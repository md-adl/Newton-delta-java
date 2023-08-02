import java.util.*;
public class CheckRectangle {
    // i/p o/p -> Scanner, Bufferreader
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        //  A[_____]C
        // check if rectangle
        if (A == C && B == D) {
            System.out.println("Its a parallelogram!");
        } else {
            System.out.println("Its not a parallelogram");
        }

    }
}

