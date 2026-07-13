package Recursion;
import java.util.Scanner;
class solution{
    public static double power(double ele , int x ){
        if(x == 0) return 1;
        
        double half = power(ele , x/2);

        if(x%2==0){
            return half*half;
        }
        else{
            return ele*half*half;
        }
}
} 

public class powerfunction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        int pow = sc.nextInt();
        

         double ans = solution.power(ele,pow);
        System.out.println("The power is " + ans);
    }
}