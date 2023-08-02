import java.util.*;
public class PositiveOrNegative {
    //     [code] -> string

// java

    public static String checkNumber(int n){

        int sign=0;
        if(n<0){
            sign = -1;
        }
        else if(n>0){
            sign = 1;
        }

        switch(sign){

            case 1:
                return "Positive";
            case -1:
                return "Negative";
        }

        return "Zero";

    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(checkNumber(n));  //
    }
//    switch (i){
//        case 1:
//            System.out.println("Monday");
//            break;
//        case 2:
//            System.out.println("Tuesday");
//            break;
//        case 3:
//            System.out.println("Wednesday");
//            break;
//        case 4:
//            System.out.println("Thursday");
//            break;
//        case 5:
//            System.out.println("Friday");
//            break;
//        case 6:
//            System.out.println("Saturday");
//            break;
//        case 7:
//            System.out.println("Sunday");

//    static int LikesBoth(int N, int A, int B){
//        return (A+B-N);
//    }


    // main, ip, calling this fn

    // N. A->apple B->oranges



    static void isPalindrome(int N)
    {
        int actual=N; // 1234
        int rev=0;  // 4321

        int digit;
        while(N>0){
            digit=N%10;  // 1
            rev = rev*10 + digit; //4321
            N=N/10; //0
        }

        if(actual==rev){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }


    // ->12121<-
    //.  iiiii
    // same from both sides

    // 5

    // 121

    // 123

    // -123
    // 321-


//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=i;j++){
//            System.out.print(j + " ");
//        }
//        System.out.println();
//    }
//   }

//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt(); // 1 to 10
//    double pi = 3.14159265358979323846;
//        System.out.printf("%."+n+"f",pi);


//    public static double average(int a, int b, int c){
//        return ((double)(a+b+c))/3;
//    }

    // int/int - int
    // double/int  - double

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//
//        System.out.println(average(a,b,c));
//    }

}


