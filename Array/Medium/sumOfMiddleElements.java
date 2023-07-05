
/*
Sum of Middle Elements of two sorted arrays
        MediumAccuracy: 47.98%Submissions: 52K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given 2 sorted arrays Ar1 and Ar2 of size N each. Merge the given arrays and find the sum of the two middle elements of the merged array.

        

        Example 1:

        Input:
        N = 5
        Ar1[] = {1, 2, 4, 6, 10}
        Ar2[] = {4, 5, 6, 9, 12}
        Output: 11
        Explanation: The merged array looks like
        {1,2,4,4,5,6,6,9,10,12}. Sum of middle
        elements is 11 (5 + 6).
        

        Example 2:

        Input:
        N = 5
        Ar1[] = {1, 12, 15, 26, 38}
        Ar2[] = {2, 13, 17, 30, 45}
        Output: 32
        Explanation: The merged array looks like
        {1, 2, 12, 13, 15, 17, 26, 30, 38, 45} 
        sum of middle elements is 32 (15 + 17).
 */



package Array.Medium;

import java.util.Arrays;

public class sumOfMiddleElements {
    static int findMidSum(int[] ar1, int[] ar2, int n) {
        int sum=0;
        int arr[] = new int[2*n];
        for(int i=0;i<n;i++){
            arr[i] = ar1[i];
            arr[n+i-1] = ar2[i];
        }

        Arrays.sort(arr);

        int ind = arr.length/2;

        sum =arr[ind-1]+arr[ind];

        return sum;
    }

    public static void main(String[] args) {
        int  Ar1[] = {1, 12, 15, 26, 38};
        int Ar2[] = {2, 13, 17, 30, 45};

        System.out.println(findMidSum(Ar1, Ar2, 5));
    }
}
