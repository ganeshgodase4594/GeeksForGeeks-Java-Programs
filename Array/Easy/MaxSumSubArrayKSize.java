

/*

Max Sum Subarray of size K
        EasyAccuracy: 49.6%Submissions: 89K+Points: 2
        Hack you way to glory and win from a cash pool prize of INR 15,000. Register for free now

        banner
        Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.

        NOTE*: A subarray is a contiguous part of any given array.

        Example 1:
        Input:
        N = 4, K = 2
        Arr = [100, 200, 300, 400]
        Output:
        700
        Explanation:
        Arr3  + Arr4 =700,
        which is maximum.
        

        Example 2:
        Input:
        N = 4, K = 4
        Arr = [100, 200, 300, 400]
        Output:
        1000
        Explanation:
        Arr1 + Arr2 + Arr3  
        + Arr4 =1000,
        which is maximum.


 */



package Array.Easy;

import java.util.ArrayList;

public class MaxSumSubArrayKSize {

    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        
        int left = 0;
        long sum = 0;
        long maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<Arr.size();i++){
            
            sum +=Arr.get(i);
            
            if(i-left+1>K){
                
                while(i-left+1 > K){
                    
                    sum -=Arr.get(left);
                    maxSum = Math.max(maxSum,sum);
                    left++;
                }
            }
            else{
                
                maxSum = Math.max(maxSum,sum);
            }
            
        }
        
        return maxSum;
    }


    public static void main(String[] args) {

        ArrayList<Integer>ls = new ArrayList<>();

        ls.add(100);
        ls.add(200);
        ls.add(300);
        ls.add(400);

        System.out.println(maximumSumSubarray(2, ls, 0));
    }
}
