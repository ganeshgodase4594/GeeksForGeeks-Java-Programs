

/*

Subarray with given sum
        EasyAccuracy: 16.5%Submissions: 1.2MPoints: 2
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

        In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

        Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

        Example 1:
        Input:
        N = 5, S = 12
        A[] = {1,2,3,7,5}
        Output: 2 4
        Explanation: The sum of elements 
        from 2nd position to 4th position 
        is 12.
        

        Example 2:
        Input:
        N = 10, S = 15
        A[] = {1,2,3,4,5,6,7,8,9,10}
        Output: 1 5
        Explanation: The sum of elements 
        from 1st position to 5th position
        is 15.


*/ 





package Array.Easy;

import java.util.ArrayList;



public class subarray_with_sum {
   static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {

        ArrayList<Integer>ls = new ArrayList<Integer>();
        boolean flag = false;
        
        for(int i=0;i<n;i++){
            int sum = 0;
            sum = arr[i];

            if(arr[i]==s){
                ls.add(i+1);
                ls.add(i+1);
                return ls;
            }
            
            for(int j=i+1;j<n;j++){
                if(sum<s){
                    sum +=arr[j];
                }

                if(sum==s){
                    flag =true;
                    ls.add(i+1);
                    ls.add(j+1);
                    return ls;
                }

                if(sum>s){
                    break;
                }
            }
        }

        if(!flag){
            ls.add(-1);
        }
        return ls;
    }

    public static void main(String[] args) {
        int N = 10, S = 15;
        int A[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(subarraySum(A, N, S));
    }
}
