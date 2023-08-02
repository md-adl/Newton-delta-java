import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PrintSumAndProduct {

    public static void printSumAndProduct(int arr[],int n){
        int sum=0;
        long product=1;

        if(n%2==0){ // even
            for(int i=0;i<n;i++){
                if(i%2==0){
                    sum+=arr[i];
                }
                else{
                    product*=arr[i];
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(i%2!=0){
                    sum+=arr[i];
                }
                else{
                    product*=arr[i];
                }
            }
        }

        System.out.println(sum+" "+product);
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printSumAndProduct(arr,n);
    }
}

// N integers
// reverse the array and then sum(even) , product (odd)

// 0 1 2 3..
// 1 2 3 4

//0. 2.   4
//1 2 3 4 5 6 -> 6 5 4 3 2 1.  [ reverses ]
//o e o e o e.   o e o e o e

// sum o
// product e


//1 2 3 4 5. -> 5 4 3 2 1. [reverse]
// o e o e o.   o e  o e o

// sum e
// product o

// 35
// 10**10