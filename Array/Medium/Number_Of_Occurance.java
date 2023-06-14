

/*
 
Number of occurrence
        MediumAccuracy: 59.34%Submissions: 119K+Points: 4
        Apply for Mega Job-A-Thon: Fresher Edition | 30+ Opportunities | Avg CTC: 7 LPA  

        Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

        Example 1:
        Input:
        N = 7, X = 2
        Arr[] = {1, 1, 2, 2, 2, 2, 3}
        Output: 4
        Explanation: 2 occurs 4 times in the
        given array.


        Example 2:
        Input:
        N = 7, X = 4
        Arr[] = {1, 1, 2, 2, 2, 2, 3}
        Output: 0
        Explanation: 4 is not present in the
        given array.


 */



package Array.Medium;


public class Number_Of_Occurance {
    static int count(int[] arr, int n, int x) {
        int ind = -1;
        ind = binarySearch(arr,x);

        if(ind==-1){
            return 0;
        }

        int left = ind-1;
        int count =1;

        while(left>=0 && arr[left]==x){
            count++;
            left--;
        }

        int right = ind+1;
        while(right<=n-1 && arr[right]==x){
            count++;
            right++;
        }

        return count;
    }

    static int binarySearch(int arr[],int k){
        int left=0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==k){
                return mid;
            }

            else if(arr[mid]>k){
                right = mid-1;
            }

            else{
                left = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]  = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;

        System.out.println(count(arr, 7, x));

    }
}
