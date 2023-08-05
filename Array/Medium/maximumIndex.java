
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
        
        int mid = (0+A.length)/2;
        ArrayList<Integer>ls = new ArrayList<>();
        
    }
    public static void main(String[] args) {
        
    }
}
