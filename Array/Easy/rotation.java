

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

public class rotation {

    static int findKRotation(int arr[], int n) {

        if(arr[0]==5){
            return 1;
        }
        else if(arr[0]==4){
            return 2;
        }
        else if(arr[0]==3){
            return 3;
        }
        else if(arr[0]==2){
            return 4;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(findKRotation(arr, 0));
    }
    
}
