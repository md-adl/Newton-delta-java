import java.util.*;
public class Array {
    public static void main(String[] args) {
        int a=7;
        int[] arr= new int[5]; // declaration and instantiation

        arr[0]=9;
        arr[1]=9;
        arr[2]=9;
        arr[3]=30;
        arr[4]=7;

        for(int i=0;i<5;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // how to take user input for array
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // 7
        int brr[]=new int[n]; // [ 0,0 ,0 ,0 ,0 ,0 ,0 ]

        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++) {
            System.out.print(brr[i]+" ");
        }

        //arr[5]=90;
        // 0 to n-1
    }
}
