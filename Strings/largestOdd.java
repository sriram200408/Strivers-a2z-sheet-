package Strings;

import java.util.Scanner;

public class largestOdd {
    static String largestodd(String str){
        int i=str.length()-1;
        while(i>=0){
            if(((str.charAt(i)-'0')%2 )!=0){
                return str.substring(0,i+1);
            }
            i--;
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(largestodd(str));
        sc.close();
    }
}
