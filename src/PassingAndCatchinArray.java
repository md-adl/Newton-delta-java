import java.util.*;
public class PassingAndCatchinArray {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] multiplyArray(int arr[],int n){
        int brr[]=new int[n+1];
        for(int i=0;i<n;i++){
            brr[i]=arr[i]*5;
        }
        return brr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int brr[]=new int[n];
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        System.out.println(brr.length);
        brr=multiplyArray(brr,n);
        System.out.println(brr.length);
        printArray(brr);

    }


}
