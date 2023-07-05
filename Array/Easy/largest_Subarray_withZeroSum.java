
/*
Largest subarray with 0 sum
        EasyAccuracy: 41.84%Submissions: 209K+Points: 2
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

        Example 1:
        Input:
        N = 8
        A[] = {15,-2,2,-8,1,7,10,23}
        Output: 5
        Explanation: The largest subarray with
        sum 0 will be -2 2 -8 1 7.

 */




package Array.Easy;

import java.util.HashMap;

public class largest_Subarray_withZeroSum {
    static int maxLen(int arr[], int n){
        int maxLen = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                maxLen=Math.max(maxLen, 1);
            }

            int sum= arr[i];
            for(int j=i+1;j<n;j++){
                sum +=arr[j];
                if(sum==0){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }

        return maxLen;
    }

    static int optimalSol(int arr[],int n){

        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int max = 0;
        int sum = 0; 

        for(int i = 0;i<n;i++) {

            sum += arr[i]; 

            if(sum == 0) {
                max = i + 1; 
            }
            else {
                if(mpp.get(sum) != null) {

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
        int N = 8;
        int A[] = {15,-2,2,-8,1,7,10,23};

        System.out.println(maxLen(A, N));

        System.out.println(optimalSol(A, N));
    }
}
