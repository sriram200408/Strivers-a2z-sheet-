package Stacks;

import java.util.Stack;

public class NextSmallerElement {
    static int[] NextSmaller(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && st.peek()>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr1 = {9,3,4,1,8,5,3,6,2};
        int[] ans = NextSmaller(arr);
        int[] ans1 = NextSmaller(arr1);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(ans1[i] + " ");
        }
    }
}
