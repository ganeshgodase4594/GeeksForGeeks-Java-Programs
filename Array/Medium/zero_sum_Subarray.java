
/*
Zero Sum Subarrays
        MediumAccuracy: 51.49%Submissions: 107K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.


        Example 1:
        Input:
        n = 6
        arr[] = {0,0,5,5,0,0}
        Output: 6
        Explanation: The 6 subarrays are 
        [0], [0], [0], [0], [0,0], and [0,0].

        Example 2:
        Input:
        n = 10
        arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
        Output: 4
        Explanation: The 4 subarrays are [-1 -3 4]
        [-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]
        
 */


package Array.Medium;
public class zero_sum_Subarray {

    public static long findSubarray(long[] arr ,int n) 
    {   
        long count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
            
            long sum =0;
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]+sum==0){
                    count++;
                }

                sum +=arr[j];
            }
        }

        return count;
    }
    public static void main(String[] args) {
        long arr[] = {0,0,5,5,0,0};

        System.out.println(findSubarray(arr, 6));
    }
}
