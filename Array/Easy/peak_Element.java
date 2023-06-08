
/*
 Peak element
        EasyAccuracy: 38.86%Submissions: 297K+Points: 2
        Apply for Mega Job-A-Thon: Fresher Edition | 30+ Opportunities | Avg CTC: 3-15 LPA  

        An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
        Given an array arr[] of size N, Return the index of any one of its peak elements.
        Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 
        
        
        Example 1:
        Input: 
        N = 3
        arr[] = {1,2,3}
        Possible Answer: 2
        Generated Output: 1
        Explanation: index 2 is 3.
        It is the peak element as it is 
        greater than its neighbour 2.
        If 2 is returned then the generated output will be 1 else 0.
        
        
        
        Example 2:
        Input:
        N = 3
        arr[] = {3,4,2}
        Possible Answer: 1
        Output: 1
        Explanation: 4 (at index 1) is the 
        peak element as it is greater than 
        it's neighbor elements 3 and 2.
        If 1 is returned then the generated output will be 1 else 0.
        
        */

package Array.Easy;

class Solution {

    public int peakElement(int[] arr, int n) {
        int ind = 0;

        if (n == 1) {
            return 0;
        }
        if (arr[0] >= arr[1]) {

            return 0;
        }

        else if (arr[arr.length - 1] >= arr[arr.length - 2]) {

            return arr.length - 1;
        }

        else {

            for (int i = 1; i < arr.length - 1; i++) {

                if (arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1]) {
                    ind = i;
                    break;
                }
            }
        }
        return ind;

    }

    public static void main(String[] args) {

    }
}
