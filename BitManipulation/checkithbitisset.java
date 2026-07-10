package BitManipulation;

import java.util.Scanner;

public class checkithbitisset {
    static boolean checkithbit(int num , int i){
      return (num  & (1<<i) )!= 0 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(checkithbit(num, i));
        sc.close();
    }
}
