

/*
 Longest subarray with sum divisible by K
        MediumAccuracy: 33.72%Submissions: 47K+Points: 4
        You've Still got a chance to get on the Leaderboard! Register for GfG Weekly Coding Contest

        banner
        Given an array containing N integers and a positive integer K, find the length of the longest sub array with sum of the elements divisible by the given value K.

        Example 1:
        Input:
        A[] = {2, 7, 6, 1, 4, 5}
        K = 3
        Output: 4
        Explanation:The subarray is {7, 6, 1, 4}
        with sum 18, which is divisible by 3.

        Example 2:
        Input:
        A[] = {-2, 2, -5, 12, -11, -1, 7}
        K = 3
        Output: 5
        Explanation:
        The subarray is {2,-5,12,-11,-1} with
        sum -3, which is divisible by 3.
 */



package Array.Medium;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSumArraySum {

    static int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int max = 0;
        int sum = 0; 

        for(int i = 0;i<n;i++) {

            sum += a[i]; 

            if(sum == 0) {
                max = i + 1; 
            }
            else {
                if(mpp.get(sum)%k==0) {
                    max = Math.max(max, i - mpp.get(sum)); 
                }
                else {
                    mpp.put(sum, i); 
                }
            }
        }
        return max;
       
    }

    public static void main(String[] args) {
        
        int []a = {-2, 2, -5, 12, -11, -1, 7};

        System.out.println(longSubarrWthSumDivByK(a, 0, 3));
    }
}
