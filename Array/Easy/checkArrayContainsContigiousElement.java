
/*

Check if array contains contiguous integers with duplicates allowed
        EasyAccuracy: 46.26%Submissions: 22K+Points: 2
        DO NOT DOWNLOAD the GfG App if you don't wish to learn on the go, download videos, access offline learning and much more. JUST DON'T!

        banner
        Given an array of n integers(duplicates allowed). Print “Yes” if it is a set of contiguous integers else print “No”.

        Example 1:
        â€‹Input : arr[ ] = {5, 2, 3, 6, 4, 4, 6, 6}
        Output : Yes
        Explanation:
        The elements  of array form a contiguous 
        set of integers which is {2, 3, 4, 5, 6} 
        so the output is "Yes".


        Example 2:
        Input : arr[ ] = {10, 14, 10, 12, 12, 
                                    13, 15} 
        Output : No

 */



package Array.Easy;

import java.util.HashSet;
import java.util.Set;

public class checkArrayContainsContigiousElement {

    static boolean areElementsContiguous (int arr[], int n) {
        
        Set<Integer>hs = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
            
            hs.add(arr[i]);
        }
        
        for(int i=min;i<=max;i++){
            
            if(!hs.contains(i)){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int arr[ ] = {5, 2, 3, 6, 4, 4, 6, 6};
        System.out.println(areElementsContiguous(arr, 0));
    }
}
