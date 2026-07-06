package Strings;
import java.util.Scanner;
public class validAnagram {
    static boolean validanagram(String s,String goal){
        if(s.length() != goal.length()) return false;
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
arr[s.charAt(i)-'a']++;
arr[goal.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
        if (arr[i]!=0) {
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        System.out.println("enter the goal string");
        String goal = sc.nextLine();
        System.out.println(validanagram(s, goal));
        sc.close();
    }
}
