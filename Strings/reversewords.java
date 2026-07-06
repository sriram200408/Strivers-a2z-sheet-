package Strings;

import java.util.Scanner;

public class reversewords {
    static String ReverseWords(String str){
StringBuilder s = new StringBuilder();
int start = 0;
int end = str.length()-1;
while(str.charAt(start) == ' '){
    start++;
}
while(str.charAt(end) == ' '){
    end--;
}
int curr = end;
while(curr>=start){
    if(str.charAt(curr) == ' '){
        s.append(str,curr+1,end+1);
        s.append(' ');
        while((curr>=start ) && (str.charAt(curr) == ' ')  ){
            curr--;
        }
        end = curr;
    }
    else if(curr==start){
        s.append(str,curr,end+1);
    }
    curr--;
}
return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ReverseWords(str));
        sc.close();
    }
}
