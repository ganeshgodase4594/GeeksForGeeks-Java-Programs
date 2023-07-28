
/*


 Maximum of all subarrays of size k
        MediumAccuracy: 26.04%Submissions: 260K+Points: 4
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

        Example 1:
        Input:
        N = 9, K = 3
        arr[] = 1 2 3 1 4 5 2 3 6
        Output: 
        3 3 4 5 5 5 6 
        Explanation: 
        1st contiguous subarray = {1 2 3} Max = 3
        2nd contiguous subarray = {2 3 1} Max = 3
        3rd contiguous subarray = {3 1 4} Max = 4
        4th contiguous subarray = {1 4 5} Max = 5
        5th contiguous subarray = {4 5 2} Max = 5
        6th contiguous subarray = {5 2 3} Max = 5
        7th contiguous subarray = {2 3 6} Max = 6


        Example 2:
        Input:
        N = 10, K = 4
        arr[] = 8 5 10 7 9 4 15 12 90 13
        Output: 
        10 10 10 15 15 90 90
        Explanation: 
        1st contiguous subarray = {8 5 10 7}, Max = 10
        2nd contiguous subarray = {5 10 7 9}, Max = 10
        3rd contiguous subarray = {10 7 9 4}, Max = 10
        4th contiguous subarray = {7 9 4 15}, Max = 15
        5th contiguous subarray = {9 4 15 12}, 
        Max = 15
        6th contiguous subarray = {4 15 12 90},
        Max = 90
        7th contiguous subarray = {15 12 90 13}, 
        Max = 90


 */



package Array.Medium;

import java.util.ArrayList;

public class maximumOfAllSubArrayK {

    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer>ls = new ArrayList<>();

        if(n==0){
            return ls;
        }

        // for(int i=0;i<n-k+1;i++){
        //    int Max = Integer.MIN_VALUE;
        //     for(int j=i;j<i+3;j++){
        //         Max = Math.max(Max, arr[j]);
        //     }

        //     ls.add(Max);
        // }

        int left = 0;
        int max = Integer.MIN_VALUE;
        int count=0;
        while(left<n){
            max = Math.max(max,arr[left]);
            left++;
            count++;

            if(count>=k){
                count=0;
                left = left-k+1;
                ls.add(max);
                max = Integer.MIN_VALUE;
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        int N = 2, K = 1;
        int arr[] = {1,2};

        ArrayList<Integer>ls = max_of_subarrays(arr, N, K);
        System.out.println(ls);
    }
}
