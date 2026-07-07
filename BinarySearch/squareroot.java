package BinarySearch;
import java.util.Scanner;
class squareroot{
    static int square(int num){
        int low = 1;
        int end = num;
        int mid = 0;
        int ans = 0;
        while(low<=end){
            mid = (low+end)/2;
if(mid*mid>num){
    end = mid-1;
}
else if(mid*mid<=num){
    ans = mid;
    low = mid+1;
}


        }
return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the square root is" + square(num));
        sc.close();
    }
}