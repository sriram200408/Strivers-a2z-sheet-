package Arrays.Easy;

import java.util.*;

public class longestsubarraywithzerosum {
    
    static int maxlen(int[] arr,int n){
        int sum = 0;
        int maxidx = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
for(int i=0;i<n;i++){
    sum+=arr[i];
    if(sum==0){
        maxidx = i+1;
    }
    else {
        if(mpp.containsKey(sum)){
maxidx = Math.max(maxidx,i-mpp.get(sum));
    }
    else{
        mpp.put(sum,i);
    }
}
}
return maxidx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    
        System.out.println("The longest subarray sum with zero is " + maxlen(arr,size));

    }
}
