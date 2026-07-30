package Recursion;
import java.util.Scanner;

class countgoodnumbers{
     static final int MOD  = 1_000_000_007; 
    public static int countGoodNumbers(int idx,int n){
if(idx==n){
    return 1;
}
int ans = 0;
if(idx%2==0){
int[] evendigits = {0,2,4,6,8};
for(int i:evendigits){
    ans = (ans + countGoodNumbers(idx+1, n))%MOD;
}
}
else{
    int[] primes = {2,3,5,7};
    for(int i:primes){
        ans = (ans + countGoodNumbers( idx+1, n)) % MOD;
    }
}
return ans;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(countGoodNumbers(0, a));
        sc.close();
    }
}