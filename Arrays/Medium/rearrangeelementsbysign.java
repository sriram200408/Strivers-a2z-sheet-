package Arrays.Medium;

import java.util.Scanner;

class solution1{
    public int[] rearrangebysign(int[] arr){
        int[] ans = new int[arr.length];
        int evenidx = 0;
        int oddidx = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                ans[evenidx] = arr[i];
                evenidx+=2;
            }
            else{
                ans[oddidx] = arr[i];
                oddidx +=2;
            }
        }
        return ans;
    }
}

public class rearrangeelementsbysign {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    solution1 obj = new solution1();
    int[] ans  = obj.rearrangebysign(arr);
    for(int i=0;i<n;i++){
        System.out.print(ans[i] + " ");
    }
    sc.close();
    }
   
}
