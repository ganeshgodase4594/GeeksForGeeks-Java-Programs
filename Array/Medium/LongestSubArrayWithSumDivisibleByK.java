package Array.Medium;

import java.util.HashMap;

public class LongestSubArrayWithSumDivisibleByK {

    static int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(0,-1);
        int len  = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<a.length;i++){
            
            sum +=a[i];
            int rem = sum % k;

            if(rem<0){
                rem +=k;
            }

            // System.out.print(rem+" ");
            
            if(hm.containsKey(rem)){
                len = Math.max(len,i-hm.get(rem));
            }
            
            else{
                hm.put(rem,i);
            }

            // System.out.println(len);
        }

        // System.out.println(hm);

        if(len==Integer.MIN_VALUE){
            return 0;
        }
        
        return len;
       
    }

    public static void main(String[] args) {
        
        int arr[] = {10, 16, 8, 13, 19, 16, 2, 2, 12, 6, 4, 15, 13, 2};

        System.out.println(longSubarrWthSumDivByK(arr, 0, 10));
    }
}
