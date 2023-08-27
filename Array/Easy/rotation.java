

/*
 Rotation
        EasyAccuracy: 23.16%Submissions: 137K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given an ascending sorted rotated array Arr of distinct integers of size N. The array is right rotated K times. Find the value of K.

        Example 1:
        Input:
        N = 5
        Arr[] = {5, 1, 2, 3, 4}
        Output: 1
        Explanation: The given array is 5 1 2 3 4. 
        The original sorted array is 1 2 3 4 5. 
        We can see that the array was rotated 
        1 times to the right.


        Example 2:
        Input:
        N = 5
        Arr[] = {1, 2, 3, 4, 5}
        Output: 0
        Explanation: The given array is not rotated.
 */



package Array.Easy;

import java.util.Arrays;

public class rotation {

    static int findKRotation(int arr[], int n) {

         int res[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = arr[i];
        }
        
        Arrays.sort(arr);
        
        if(isSorted(arr,res)){
            return 0;
        }
    
        for(int i=0;i<=arr.length-2;i++){
            
            if(arr[arr.length-1]==res[i]){
                return i+1;
            }
        }
        
        return 0;
    }

    static boolean isSorted(int[] arr,int res[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=res[i]){
                return false;
            }
            
        }
            return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(findKRotation(arr, 0));
    }
    
}
