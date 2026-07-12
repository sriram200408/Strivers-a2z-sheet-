package Arrays.Medium;

import java.util.Scanner;

public class maximumsubarraysum {
    static int maxsubsum(int[] arr){
        int currsum = arr[0];
        int maxsubsum = arr[0];
        for(int i=1;i<arr.length;i++){
            currsum = Math.max(arr[i] , currsum + arr[i]);
            maxsubsum = Math.max(maxsubsum,currsum);
        }
        return maxsubsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum sub array sum is " + maxsubsum(arr));
        sc.close();
    }
}
