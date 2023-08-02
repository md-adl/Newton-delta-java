import java.util.*;
public class MonthNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1 2 3 4 5 6 7 8 9 10 11 12
        int m=sc.nextInt();

//        Spring – March to May 3-5
//        Summer – June to August 6-8
//        Autumn – September to November 9-11
//        Winter – December to February 12-2
//        If the month is out of the range 1 to 12 output should be "Invalid"

        if(m>=3 && m<=5){
            System.out.println("Spring");
        }
        else if(m>=6 && m<=8){
            System.out.println("Summer");
        }
        else if(m>=9 && m<=11){
            System.out.println("Autumn");
        }
        else if(m==12 || m==1 || m==2){
            System.out.println("Winter");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
