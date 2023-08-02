import java.util.*;
public class kthSmallestElement {
    public static int kthSmallest(int val[],int freq[],int n,int k){
        // Bubble sort algorithm -> swap adjacent element if they are not sorted
        return n;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int val[]=new int[n];
        for(int i=0;i<n;i++){
            val[i]=sc.nextInt();
        }

        int freq[]=new int[n];
        for(int i=0;i<n;i++){
            freq[i]=sc.nextInt();
        }

        int k=sc.nextInt();

        System.out.println(kthSmallest(val,freq,n,k));
    }
}
