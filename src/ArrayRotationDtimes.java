import java.util.*;
public class ArrayRotationDtimes {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // rotations

        // 2 3 4 5 1
        // <-<-
        for(int j=0;j<d;j++){ // d times
            int temp=arr[0]; // 1
            for(int i=1;i<n;i++){
                arr[i-1]=arr[i];
            }
            arr[n-1]=temp;
        }



        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

