
/*
 Maximum Product Subarray
        MediumAccuracy: 18.09%Submissions: 296K+Points: 4
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

        Example 1:
        Input:
        N = 5
        Arr[] = {6, -3, -10, 0, 2}
        Output: 180
        Explanation: Subarray with maximum product
        is [6, -3, -10] which gives product as 180.


        Example 2:
        Input:
        N = 6
        Arr[] = {2, 3, 4, 5, -1, 0}
        Output: 120
        Explanation: Subarray with maximum product
        is [2, 3, 4, 5] which gives product as 120.


 */




package Array.Medium;

public class MaximumProductSubArray {

    static long maxProduct(int[] arr, int n) {

        long prod ;
        long max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            prod =1;
            for(int j=i;j<arr.length;j++){
                prod = prod * arr[j];
                max = Math.max(max,prod);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, -1, 0};

        System.out.println(maxProduct(arr,6));
    }
}
