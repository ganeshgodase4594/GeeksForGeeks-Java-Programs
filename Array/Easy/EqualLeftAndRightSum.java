
/*

Equal Left and Right Subarray Sum
        EasyAccuracy: 55.07%Submissions: 32K+Points: 2
        Hack you way to glory and win from a cash pool prize of INR 15,000. Register for free now

        banner
        Given an array A of n positive numbers. The task is to find the first index in the array such that the sum of elements before it is equal to the sum of elements after it.

        Note:  Array is 1-based indexed.

        Example 1:
        Input: 
        n = 5 
        A[] = {1,3,5,2,2} 
        Output: 3 
        Explanation: For second test case 
        at position 3 elements before it 
        (1+3) = elements after it (2+2). 
        

        Example 2:
        Input:
        n = 1
        A[] = {1}
        Output: 1
        Explanation:
        Since its the only element hence
        it is the only point.
        Your Task:
        The task is to complete the function equalSum() which takes the array and n as input parameters and returns the point. Return -1 if no such point exists.

 */



package Array.Easy;

public class EqualLeftAndRightSum {

    static int equalSum(int [] A, int N) {
		
		if(A.length==1){
		    return 1;
		}
		
		int prefixSum[] = new int[A.length];
		    
		int sum = 0;
		for(int i=A.length-1;i>=0;i--){
		    
		    prefixSum[i] = sum;
		    sum +=A[i];
		}
		
		sum = 0;
		
		for(int i=0;i<A.length;i++){
		    
		    if(sum==prefixSum[i]){
		        return i+1;
		    }
		    
		    sum +=A[i];
		}
		
		return -1;
	}
    public static void main(String[] args) {
        
        int Arr[] = {1,3,5,2,2};

        System.out.println(equalSum(Arr, 0));
    }
}
