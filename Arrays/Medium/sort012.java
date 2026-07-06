package Arrays.Medium;

import java.util.Scanner;

public class sort012 {
    static void Sort012(int[] arr){
        int length = arr.length;
        int start = 0;
        int end = length-1;
        int curr = 0;
        while(curr <= end){
          if(arr[curr] == 0){
            arr[curr] = arr[start];
            arr[start] = 0;
            start++;
            curr++;
          }
          else if(arr[curr] == 2){
            arr[curr] = arr[end];
            arr[end] = 2;
            end--;
            curr++;
          }
          else if(arr[curr] == 1){
            curr++;
          }
        }
        for(int i=0;i<length;i++){
System.out.print( arr[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Sort012(arr);
        sc.close();
    }
}
