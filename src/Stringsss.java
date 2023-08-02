import java.util.*;
public class Stringsss {
    public static void main(String[] args) {
        String str="rohit arora"; // using string literal
        System.out.println(str);

        System.out.println(str.charAt(3));

        String st="687";

        int x=(int)('c');
        int r=Integer.parseInt(st);
        Integer.valueOf("1234");

        Character abc = 'a';
        char rt = 'a';
        System.out.println(r);

        String st3=String.valueOf(12.34543);
        System.out.println(st3);//"12.34543"



        String str1=new String("rohit arora"); // using new keyword
        System.out.println(str1);


        Scanner sc=new Scanner(System.in);
        String str2=sc.next();
        String str3=sc.next(); // next
        String str4=new String(sc.nextLine()); // start taking the next input from mnext line
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

//        String str5=sc.nextLine(); //
//        System.out.println(str5);
//
//        String str6=sc.nextLine(); // include spaces
//        System.out.println(str6);

    }
}
