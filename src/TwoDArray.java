import java.util.*;
public class TwoDArray {
    public static int[][] doSomething(int[][] arr){ // 2 d array as arguments
        int crr[][]=new int[2][2];
        System.out.println("Rows "+arr.length);
        System.out.println("Columns "+arr[0].length);
        return crr;
        // r c
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//
//        arr[2]=9;
//        System.out.println(arr[4]);
        /////
        // [ , , , , , , ]

        int r=sc.nextInt();//5
        int c=sc.nextInt();//4

        int brr[][]=new int[r][c];
        // 5*4 int

        for(int i=0;i<r;i++){ // 0 1 2 3 4
            for(int j=0;j<c;j++) { // 0 1 2 3
                brr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){ // 0 1 2 3 4
            for(int j=0;j<c;j++) { // 0 1 2 3
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
