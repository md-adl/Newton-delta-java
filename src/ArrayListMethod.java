import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListMethod {
    public static boolean isPrime(int n) {
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int arrr[] = new int[7];
        //functions in array list

        arr.add(45);
        arr.add(55);
        arr.add(25);
        arr.add(50);
        arr.add(33);
        // [45,60,50,33]

        System.out.println(arr.get(3));
        System.out.println(arr.get(2));
        arr.set(2, 60);
        System.out.println(arr.get(2));


        System.out.println(arr.get(1));
        System.out.println(arr);
        arr.remove(sc.nextInt());
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            if (!isPrime(arr.get(i))) {
                arr.remove(i);
            }
        }
    }

//    public static void main (String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>();
//
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            int a=sc.nextInt();
//            arr.add(a);
//        }
//
//        for(int i=0;i<n;i++){
//            System.out.print(arr.get(i)+" ");
//        }

}
