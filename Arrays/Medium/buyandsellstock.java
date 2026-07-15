package Arrays.Medium;
import java.util.Scanner;

class solution{
    public static int buynsell(int[] arr){
        int maxprofit = 0;
        int currmin = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < currmin) currmin = arr[i];
            else{
                maxprofit = Math.max(maxprofit,arr[i]-currmin);
            }
        }
        return maxprofit;
    }
    
}
public class buyandsellstock{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int ans = solution.buynsell(arr);
    System.out.println("The maximum profit is " + ans);
    sc.close();
}
}