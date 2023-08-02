import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        int age=5;
        // Ternary operator  e1?e2:e3
        //               BE       E                    F
//        String str = age>18 ? "You can Vote!"   : "You can't Vote!"   ;
//        System.out.println(str);

        System.out.println( age>18 ? "You can Vote!"   : "You can't Vote!");



        // n1 n2

        // n1>n2 n1-n2
        //       n1+n2

        int n1=23;
        int n2=34;
        int n3=39;

        if(n1>n2){
            System.out.println(n1-n2);
        }
        else{
            System.out.println(n1+n2);
        }

        System.out.println( n1>n2 ? n1-n2 : n1+n2  );


        ////////////
        // n1 n2

        System.out.println( n1>n2 ? n1 : n2  ); // -> which is larger

        // n1 n2 n3

        System.out.println( (n1>n2 ? n1 : n2)>n3 ? (n1>n2 ? n1 : n2) : n3 );
    }
}
