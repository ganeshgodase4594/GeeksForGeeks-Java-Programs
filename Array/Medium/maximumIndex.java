
/*

 Maximum Index
        MediumAccuracy: 24.5%Submissions: 141K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.
        

        Example 1:
        Input:
        N = 2
        A[] = {1, 10}
        Output:
        1
        Explanation:
        A[0]<A[1] so (j-i) is 1-0 = 1.

        Example 2:
        Input:
        N = 9
        A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
        Output:
        6
        Explanation:
        In the given array A[1] < A[7]
        satisfying the required 
        condition(A[i] < A[j]) thus giving 
        the maximum difference of j - i 
        which is 6(7-1).

 */



package Array.Medium;

import java.util.ArrayList;

public class maximumIndex {

    static int maxIndexDiff(int A[], int N) { 
        
        int leftMin[] = new int[A.length];
        int rightMax[] = new int[A.length];

        leftMin[0] = A[0];
        rightMax[A.length-1] = A[A.length-1];

        for(int i=1;i<A.length;i++){
            leftMin[i] = Math.min(leftMin[i-1],A[i]);
            rightMax[A.length-i-1] = Math.max(rightMax[A.length-i], A[A.length-i-1]);
        }

        int left = 0;
        int right = 0;
        int ind = 0;
        while(left<A.length && right<A.length){

            if(leftMin[left]<=rightMax[right]){
                ind = Math.max(ind,right-left);
                right++;
            }

            else{
                left++;
            }
        }

        return ind;
        
    }
    
    public static void main(String[] args) {
        int A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};

        System.out.println(maxIndexDiff(A, 0));
    }
}
