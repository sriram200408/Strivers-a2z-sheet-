package BinarySearch;

import java.util.Scanner;

public class countoccurences {
    static int countOccurence(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int first = 0;
        int last = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                first = mid;
                end = mid-1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        start = 0;
        end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                last = mid;
                start = mid +1;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return last-first+1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target value");
        int target = sc.nextInt();
        System.out.println("The value is present " + countOccurence(arr, target) + " times");
        sc.close();
    }
}
