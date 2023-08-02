import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dayNo = sc.nextInt(); // 1- 7
//
//        if(dayNo==1){
//            System.out.println("Monday");
//        }
//        else if(dayNo==2){
//            System.out.println("Tuesday");
//        }
//        else if(dayNo==3){
//            System.out.println("Wed");
//        }
//        else if(dayNo==4){
//            System.out.println("Thur");
//        }
//        else if(dayNo==5){
//            System.out.println("Fri");
//        }
//        else if(dayNo==6){
//            System.out.println("Sat");
//        }
//        else if(dayNo==7){
//            System.out.println("Sun");
//        }
//        else{
//            System.out.println("Wrong i/p");
//        }


        switch(dayNo){
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tue");
                break;
            case 3: System.out.println("Wed");
                break;
            case 4: System.out.println("Thur");
                break;
            case 5: System.out.println("Fri");
                break;
            case 6: System.out.println("Sat");
                break;
            case 7: System.out.println("Sun");
                break;
            default :  System.out.println("Wrong day");
        }

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();

//        switch(n%2){
//            case 0: System.out.println("Even");
//                break;
//            case 1: System.out.println("Odd");
//        }

        // if(n%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }
//        switch(M){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:System.out.println("31");
//                break;
//
//
//            case 2:System.out.println("28");
//                break;
//
//            case 4:
//            case 6:
//            case 9:
//            case 11:System.out.println("30");


        }
}
