package Strings;
import java.util.Scanner;
public class removeparanthesis {
    static String removepara(String str){
        StringBuilder s = new StringBuilder();
        int count = 0;
        for(int i=0;i<str.length();i++){
if(str.charAt(i) == '('){
    count++;
    if(count>1){
        s.append('(');
    }
}
else if(str.charAt(i)==')'){
    count--;
    if(count>0) s.append(')');
}
        }
       return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
System.out.println(removepara(str));
sc.close();
    }
}
