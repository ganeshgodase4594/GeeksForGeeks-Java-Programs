
/*
 
Non-Repeating Element
        EasyAccuracy: 39.31%Submissions: 71K+Points: 2
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Find the first non-repeating element in a given array arr of N integers.
        Note: Array consists of only positive and negative integers and not zero.

        Example 1:
        Input : arr[] = {-1, 2, -1, 3, 2}
        Output : 3
        Explanation:
        -1 and 2 are repeating whereas 3 is 
        the only number occuring once.
        Hence, the output is 3. 
        

        Example 2:
        Input : arr[] = {1, 1, 1}
        Output : 0
 */


package Array.Easy;

import java.util.ArrayList;


public class non_repeating_Element {

     static int firstNonRepeating(int arr[], int n){
       ArrayList<Integer>ls1 = new ArrayList<>();

       for(int i=0;i<arr.length;i++){

       }

       for(int i=0;i<arr.length;i++){
            if(!(ls1.contains(arr[i]))){
                return arr[i];
            }
       }

        return 0;
    } 
    
    public static void main(String[] args) {
        int arr[] = {-1 ,-17, -12, 8, 16, -17 ,-13, -14, -3 ,-6, -5, -11, -10, -12, -5, 19, -17, -5, -1 ,12};

        System.out.println(firstNonRepeating(arr, arr.length));
    }
}
