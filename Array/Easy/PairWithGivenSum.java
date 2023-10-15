

/*
 
Pair with given sum in a sorted array
        EasyAccuracy: 26.04%Submissions: 44K+Points: 2
        Hack you way to glory and win from a cash pool prize of INR 15,000. Register for free now

        banner
        You are given an array Arr of size N. You need to find all pairs in the array that sum to a number K. If no such pair exists then output will be -1. The elements of the array are distinct and are in sorted order.
        Note: (a,b) and (b,a) are considered same. Also, an element cannot pair with itself, i.e., (a,a) is invalid.

        Example 1:
        Input:
        n = 7
        arr[] = {1, 2, 3, 4, 5, 6, 7}
        K = 8
        Output:
        3
        Explanation:
        We find 3 such pairs that
        sum to 8 (1,7) (2,6) (3,5)

        Example 2:
        Input:
        n = 7
        arr[] = {1, 2, 3, 4, 5, 6, 7}
        K = 98 
        Output:
        -1


 */



package Array.Easy;

public class PairWithGivenSum {

    static int Countpair(int a[], int n, int sum)
    {
        int pairCount = 0;
        int left = 0;
        int right = a.length-1;
        boolean flag = false;
        
        while(left<right){
            
            if(a[left]+a[right]==sum){
                
                flag = true;
                pairCount++;
                left++;
                right--;
            }
            
            else if(a[left]+a[right]>sum){
                right--;
            }
            
            else{
                left++;
            }
            
        }
        
        if(!flag){
            return -1;
        }

        return pairCount;
    }


    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k =8;

        System.out.println(Countpair(arr, 0, k));
    }
}
