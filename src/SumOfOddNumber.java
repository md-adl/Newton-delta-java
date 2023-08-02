import java.util.*;

public class SumOfOddNumber {
    public static int sumOfOddNumbers(int n){ // 1 to n
        int sum=0;
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
        }
        return sum;
    }


    // i+=2
    // i = i+2

    // i=i+1


    // 1+3+5+7+9

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfOddNumbers(n));
    }
}
