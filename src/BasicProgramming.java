import java.util.*;
public class BasicProgramming {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int age = sc.nextInt();
        // if
        // if else(default)
        // if else if
        // if else if , else(default)
        if(age>18){
            System.out.println("You can Vote!");
        }
        else{
            System.out.println("You can't Vote!");
        }

        // 11 15 -> play hide and seek, g2, g3
        // 16 20 -> chess ,badminton
        // 20 25 -> cricket
        // 26 + -> football

        if(age>10 && age<=15){
            System.out.println("Choose option in g1, g2, g3");
        }
        else if(age>=16 && age<=20){
            System.out.println("Choose option in chess,badi");
        }
        else if(age>=21 && age<=25){
            System.out.println("Choose option in cricket");
        }
        else{ // no check, default
            System.out.println("Choose option in Football");
        }


        // &&
        // ||

        // 2nd program
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int d=sc.nextInt();
//        int e=sc.nextInt();
//
//        int percentage = ((a+b+c+d+e)/5);
//
//        if(percentage>=80){
//            System.out.println("A");
//        }
//        else if(percentage>=60){
//            System.out.println("B");
//        }
//        else if(percentage>=40){
//            System.out.println("C");
//        }
//        else{
//            System.out.println("D");
//        }


        // 3rd program
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        if(a <= 10 && b >= 10){
//            System.out.print("true ");
//        }else{
//            System.out.print("false ");
//        }
//
//        if(a%2==0 || b%2==0){
//            System.out.print("true ");
//        }else{
//            System.out.print("false ");
//        }
//
//        if(a!=b){
//            System.out.print("true ");
//        }else{
//            System.out.print("false ");
//        }

//        4th program
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
//        int n3=sc.nextInt();
//        System.out.println( (n1>n2 ? n1 : n2)>n3 ? (n1>n2 ? n1 : n2) : n3 );

//    5th program
//        int t=sc.nextInt();
//
//        for(int i=1;i<=t;i++){

//            int pa=sc.nextInt();
//            int pb=sc.nextInt();
//            int qa=sc.nextInt();
//            int qb=sc.nextInt();
//
//            int p=(pa>pb?pa:pb);
//            int q=(qa>qb?qa:qb);
//
//            if(p<q){
//                System.out.println("P");
//            }
//            else if(q<p){
//                System.out.println("Q");
//            }
//            else{
//                System.out.println("TIE");
//            }
//
//        }
    }

}
