package Arrays.Medium;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class leadersinarray{
 static ArrayList<Integer> leaders(int[] arr){
    ArrayList<Integer> ans = new ArrayList<>();
    int max = arr[arr.length-1];
    ans.add(max);
    for(int i=arr.length-2;i>=0;i--){
        if(arr[i]>max){
            max = arr[i];
ans.add( arr[i]);
        }
    }
    Collections.reverse(ans);
    return ans;
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int idx = 0;
    ArrayList<Integer> ans = leaders(arr);
    while(idx!=ans.size()){
        System.out.print(ans.get(idx) + " ");
        idx++;
    }
    sc.close();
 }
}