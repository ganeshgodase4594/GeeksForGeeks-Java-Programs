
/*

 Zero Sum Subarrays
        MediumAccuracy: 51.49%Submissions: 111K+Points: 4
        This Problem will always be here, but this offer won't be back! Save 25% Now

        You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.


        Example 1:
        Input:
        n = 6
        arr[] = {0,0,5,5,0,0}
        Output: 6
        Explanation: The 6 subarrays are 
        [0], [0], [0], [0], [0,0], and [0,0].

        Example 2:
        Input:
        n = 10
        arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
        Output: 4
        Explanation: The 4 subarrays are [-1 -3 4]
        [-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]

 */




package Array.Medium;

import java.util.HashMap;
import java.util.Map;


public class zeroSumSubArray {

    static long findSubarray(long[] arr ,int n){

        int count = 0;
        int sum  = 0;
        Map<Integer,Integer>mp = new HashMap<>();
        
        mp.put(0, 1);

        for(int i=0;i<arr.length;i++){
            sum +=arr[i];

            int reqSum = (sum -0);

            count +=mp.getOrDefault(reqSum, 0);  
            
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }

        return count;
    } 

    public static void main(String[] args) {
        long[] arr = {0,0,5,5,0,0};

        System.out.println(findSubarray(arr, 0));
    }
}
