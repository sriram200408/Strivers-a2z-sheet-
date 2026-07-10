package BitManipulation;

import java.util.Scanner;

public class setrightmostbit {
    static int setRightmost(int num){
        return num|(num+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("the number after setting rightmost bit to 1 is " + setRightmost(num));
        sc.close();
    }
}
