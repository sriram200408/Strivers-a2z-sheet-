package Arrays.Hard;
import java.util.Scanner;

/**
 * findrepeatingandmissing
 */
public class findrepeatingandmissing {

    // Math Equations approach  
    // Time complexity = O(n)
    // Space complexity = O(1)
    static int[] findRepeatingnmissing(int[] arr){
        int[] ans = new int[2];
        int sum = 0;
        int sumsquare = 0;
        int length = arr.length;
        for(int i=0;i<length;i++){
            sum += arr[i];
            sumsquare += arr[i]*arr[i];
        }
        int orgsum = length*(length+1)/2;
        int orgsumsquare = length*(length+1)*((2*length) + 1)/6;
        int aplusb = (sumsquare-orgsumsquare)/(sum-orgsum);
        ans[0] = (aplusb+(sum-orgsum))/2;
        ans[1] = aplusb-ans[0];

        return ans;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = findRepeatingnmissing(arr);
        System.out.println("The repeating element is " + ans[0]);
        System.out.println("The missing number is " + ans[1]);
        sc.close();
    }
}