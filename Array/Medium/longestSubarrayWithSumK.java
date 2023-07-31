
/*
 Longest Sub-Array with Sum K
        MediumAccuracy: 24.64%Submissions: 176K+Points: 4
        Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

        Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.

        

        Example 1:
        Input :
        A[] = {10, 5, 2, 7, 1, 9}
        K = 15
        Output : 4
        Explanation:
        The sub-array is {5, 2, 7, 1}.


        Example 2:
        Input : 
        A[] = {-1, 2, 3}
        K = 6
        Output : 0
        Explanation: 
        There is no such sub-array with sum 6.

 */




package Array.Medium;

import java.util.HashMap;


public class longestSubarrayWithSumK {

    static int lenOfLongSubarr (int A[], int N, int K) {
        HashMap<Integer,Integer>hm = new HashMap<>();

        int sum = 0;
        int length = 0;
        for(int i=0;i<A.length;i++){
            sum +=A[i];
            
            if(sum == K){
                length = Math.max(length, i+1);
            }

            int reqSum = sum-K;

            if(hm.containsKey(reqSum)){
                length = Math.max(length,i-hm.get(reqSum));
            }
        
            if(!hm.containsKey(sum)){
                hm.put(sum, i);
            }
        }

        return length;
    }

    static int lenOfLongSubarrOptimal (int A[], int N, int K) {
        int left=0;
        int right = 0;
        int sum = A[0];
        int length = 0;


        while(right < A.length){

            while(left<=right && sum > K){
                sum -=A[left];
                left++;
            }

            if(sum==K){
                length = Math.max(length,right-left+1);
            }

            right++;
            
            if(right<A.length){
                sum +=A[right];
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int A[] = {10, 5, 2, 7, 1, 9};
        int K = 15;

        System.out.println(lenOfLongSubarr(A, K, K));


    }
}
