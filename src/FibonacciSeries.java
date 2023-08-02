import java.util.*;
public class FibonacciSeries {

    public static void printAntiFibonacci(int T){
        for(int i=T;i>=1;i--){
            System.out.print(i+" ");
        }
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printAntiFibonacci(n);
    }
}
// 0 1 1 2 3 5 8 13 21 ... - fibonacci
//                      ... anti fibionnaci


// 4
// 1 2 3 4

// 4 3 2 1
