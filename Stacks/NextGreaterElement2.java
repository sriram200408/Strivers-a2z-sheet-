package Stacks;

import java.util.Stack;

public class NextGreaterElement2 {

   static int[] nextgreater(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int curridx = i%n;
            int currele = arr[curridx];
            while(!st.isEmpty() && st.peek()<=currele){
                st.pop();
            }
if(i<n){
    if(st.isEmpty()){
        ans[curridx] = -1; 
    }
    else{
        ans[curridx] = st.peek();
    }
}
st.push(currele);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 7, 6, 0};
        int[] ans = nextgreater(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
