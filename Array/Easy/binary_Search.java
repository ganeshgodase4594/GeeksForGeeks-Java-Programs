

/*
 Binary Search  

        Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.

        Example 1:
        Input:
        N = 5
        arr[] = {1 2 3 4 5} 
        K = 4
        Output: 3
        Explanation: 4 appears at index 3.

        Example 2:
        Input:
        N = 5
        arr[] = {11 22 33 44 55} 
        K = 445
        Output: -1
        Explanation: 445 is not present.
 */






package Array.Easy;


class Solution {
    static int binarysearch(int arr[], int n, int k) {
        int left = 0;
        int right = n-1;
        int ind = -1;
        
        while(left <= right){
            int mid = (left+right)/2;
            
            if(arr[mid]>k){
                right = mid-1;
            }
            
            else if(arr[mid]<k){
                left =mid+1;
            }
            
            if(arr[mid]==k){
                ind = mid;
                break;
            }
        }
        
        return ind;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarysearch(arr, 5, 4));
    }

}
