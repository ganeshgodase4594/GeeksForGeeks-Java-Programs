
/*
Swapping pairs make sum equal
        MediumAccuracy: 23.94%Submissions: 82K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given two arrays of integers A[] and B[] of size N and M, the task is to check if a pair of values (one value from each array) exists such that swapping the elements of the pair will make the sum of two arrays equal.

        

        Example 1:
        Input: N = 6, M = 4
        A[] = {4, 1, 2, 1, 1, 2}
        B[] = (3, 6, 3, 3)
        Output: 1
        Explanation: Sum of elements in A[] = 11
        Sum of elements in B[] = 15, To get same 
        sum from both arrays, we can swap following 
        values: 1 from A[] and 3 from B[]


        Example 2:
        Input: N = 4, M = 4
        A[] = {5, 7, 4, 6}
        B[] = {1, 2, 3, 8}
        Output: 1
        Explanation: We can swap 6 from array 
        A[] and 2 from array B[]


 */



package Array.Medium;

public class swapping_pairs_toEqual {

    static long findSwapValues(long A[], int n, long  B[], int m)
    {
        long sum1= 0;
        long sum2 =0;
        for(int i=0;i<n;i++){
            sum1 +=A[i];
        }

        for(int i=0;i<m;i++){
            sum2+=B[i];
        }


        if(sum1==sum2){
            return 1;
        }


        else{

            for(int i=0;i<n;i++){

                for(int j=0;j<m;j++){
                    if(sum2+A[i]-B[j]==sum1+B[j]-A[i]){
                        return 1;
                    }
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        long A[] ={4, 1, 2, 1, 1, 2};
        long B[] = {3, 6, 3, 3};

        int n=6;
        int m=4;

        System.out.println(findSwapValues(A, n, B, m));


    }
}
