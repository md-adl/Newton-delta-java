import java.util.*;
public class midDiff {
    public static int minDiff(int arr[],int n){
        int minDiff=arr[n-1]-arr[0];
        if(minDiff<0){
            minDiff=minDiff*-1;
        }
        for(int i=0;i<=n-2;i++){
            int diff = arr[i+1]-arr[i];
            if(diff<0){
                diff=diff*-1;
            }
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        return minDiff;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for(int j=1;j<=t;j++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(minDiff(arr,n));
        }
    }
}

// N. -> circular
// min diff

// 8 -8 9 -9 10 -11 12 ..8

// 16 17 18 19 21 23  4
