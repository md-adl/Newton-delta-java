import java.util.*;
public class findWinner {

    public static String findWinner(int n,int arr[]){
        int NumberOfPilesOdd = 0;
        boolean OnePresent= false;

        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                NumberOfPilesOdd++;
            }
            if(arr[i]==1){
                OnePresent=true;
                break;
            }
        }

        if(OnePresent){ // first
            return "CHEF";
        }

        if(NumberOfPilesOdd%2==0){
            return "CHEFINA";
        }
        return "CHEF";
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(findWinner(n,arr));
        }
    }
}

// [4 ,3 ,0] ->n
//. 1 2 3

// Chef, Chefina

// when 1 pile becomes empoty -> last move


//[0 5 6] -> chef
