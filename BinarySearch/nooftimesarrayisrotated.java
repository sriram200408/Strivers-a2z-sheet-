package BinarySearch;

import java.util.Scanner;

public class nooftimesarrayisrotated {
    static int noofrotations(int[] arr){
        int start = 0;
        int end  = arr.length-1;
        while(start<end){
            int mid = (start + end)/2;
            if(arr[mid]<arr[end]){
end = mid;
            }
            else if(arr[mid] > arr[end]){

start = mid +1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is rotated " + noofrotations(arr) + " Times");
        sc.close();
    }
}
