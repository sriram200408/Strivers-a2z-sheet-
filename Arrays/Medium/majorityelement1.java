package Arrays.Medium;

import java.util.Scanner;

public class majorityelement1 {
    static int majority1(int[] arr){
        int freq = 0;
        int ele = 0;
        for(int i=0;i<arr.length;i++){
            if(freq == 0){
                ele = arr[i];
            }
            else if(arr[i] == ele){
                freq++;
            }
            else if(arr[i] != ele){
                freq--;
            }
        }
        return ele;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The majority element is " + majority1(arr));
        sc.close();
    }
}
