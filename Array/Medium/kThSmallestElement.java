

/*
 
Kth smallest element
        MediumAccuracy: 35.17%Submissions: 488K+Points: 4
        Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

        Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

        Note :-  l and r denotes the starting and ending index of the array.

        Example 1:
        Input:
        N = 6
        arr[] = 7 10 4 3 20 15
        K = 3
        Output : 7
        Explanation :
        3rd smallest element in the given 
        array is 7.

        Example 2:
        Input:
        N = 5
        arr[] = 7 10 4 20 15
        K = 4
        Output : 15
        Explanation :
        4th smallest element in the given 
        array is 15.

 */



package Array.Medium;

import java.util.Set;
import java.util.TreeSet;

public class kThSmallestElement {

    static int kthSmallest(int[] arr, int l, int r, int k){
        Set<Integer> s = new TreeSet<Integer>();

        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }

        System.out.println(s);
        int count = 1;
        for(int i : s){
            if(count==k){
                return i;
            }
            count++;
        }

        return -1;
    } 

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 20 ,15};
        int k=4;

        System.out.println(kthSmallest(arr, 0, 0, k));
    }
}
