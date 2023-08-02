import java.util.*;
public class String2 {
    public static void main(String[] args) {
        String str1="rohit";
        String str2="rohit";

        System.out.println(str2.compareTo(str1)); //0 , +ve , -ve

        System.out.println(str1.substring(2,4)); // 2 - 3
        // i->end
        // i- j-1

        System.out.println(str1);
        str1= str1.concat(str2);
        str1= str1 + str2;

        System.out.println(str1);

        System.out.println(str1.length());


        String str3="hello world";
        System.out.println(str3);

        System.out.println(str3.charAt(6));

        int x= Integer.parseInt("1231221");
        System.out.println(x);
        String s4=Integer.toString(12113);
        System.out.println(s4);

    }
}
