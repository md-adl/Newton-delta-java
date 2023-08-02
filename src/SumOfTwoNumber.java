import java.util.*;
public class SumOfTwoNumber {

    //1. parameter/attirbute -> input
    // 2. name of the function
    // 3. body
    // 4. returntype

    //   -> [mac[processing]hine] ->
    public static void main(String[] args) {  // fn
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(checkEvenOrOdd(n)); // calling

        String ans=checkEvenOrOdd(n);
        System.out.println(ans);
    }

    public static String checkEvenOrOdd(int a){ // declaring
        if(a%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }




    public static int sum(int n,int m){
        return n+m;
    }

    public static double sum(double n,double m){
        return n+m;
    }

    public static long sum(long n,long m){
        return n+m;
    }


    //  arguments
    // returntype
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println(sum(a,b));
//
//        double c=sc.nextDouble();
//        double d=sc.nextDouble();
//        System.out.println(sum(c,d));
//
//        long e=sc.nextLong();
//        long f=sc.nextLong();
//        System.out.println(sum(e,f));
//    }
    // break
    // continue
    // return - fn ends
}
