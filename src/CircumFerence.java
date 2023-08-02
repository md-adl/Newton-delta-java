import java.util.*;
public class CircumFerence {
    public static double circumference(double r){
        double  pi = ((double)22)/7;
        return 2*pi*r;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r = sc.nextDouble(); // 2.4
        System.out.println(circumference(r));
    }
}

