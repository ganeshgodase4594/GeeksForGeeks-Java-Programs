
/*
 Subsets with XOR value
        MediumAccuracy: 44.96%Submissions: 21K+Points: 4
        Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

        Given an array arr of N integers and an integer K, find the number of subsets of arr having XOR of elements as K.
        

        Example 1:

        Input:
        N = 4
        k = 6
        arr: 6 9 4 2
        Output:
        2
        Explanation:
        The subsets are 
        {4,2} and {6}


        Example 2:
        Input:
        N = 5
        K = 4
        arr: 1 2 3 4 5
        Output:
        4
        Explanation:
        The subsets are {1, 5},
        {4}, {1, 2, 3, 4},
        and {2, 3, 5}

 */

package Array.Medium;

public class Subset_With_XOR_Value {
    static int BruteForce(int arr[], int N, int K) {

        int count = 0;
        for (int i = 0; i < N; i++) {

            for (int j = i; j < N; j++) {

                int xor = 0;
                for (int k = i; k <= j; k++) {
                    xor = xor ^ arr[k];

                }

                if (xor == K) {
                    count++;
                }

            }
        }
        return count;
    }

    static int Better(int arr[], int N, int K) {

        int count = 0;
        for (int i = 0; i < N; i++) {
            int xor = 0;
            for (int j = i; j < N; j++) {
                xor = xor ^ arr[j];

                if (xor == K) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 4, 2 };
        int k = 6;
        int N = 4;
        System.out.println(BruteForce(arr, N, k));
        System.out.println(Better(arr, N, k));
    }
}
