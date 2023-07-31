
/*
 Count the Zeros
        EasyAccuracy: 68.08%Submissions: 93K+Points: 2
        Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

        Given an array of size N consisting of only 0's and 1's. The array is sorted in such a manner that all the 1's are placed first and then they are followed by all the 0's. Find the count of all the 0's.

        Example 1:
        Input:
        N = 12
        Arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}
        Output: 3
        Explanation: There are 3 0's in the given array.

        Example 2:
        Input:
        N = 5
        Arr[] = {0, 0, 0, 0, 0}
        Output: 5
        Explanation: There are 5 0's in the array.

 */




package Array.Easy;

public class countZeros {

    static int countZeroes(int[] arr, int n) {
        int count = 0;
       for(int i=arr.length-1;i>=0;i--){
           if(arr[i]==0){
               count++;
           }
           else{
               break;
           }
       }
       return count;
    }
    public static void main(String[] args) {
        int  Arr[] = {0, 0, 0, 0, 0};

        System.out.println(countZeroes(Arr, 0));
    }
}
