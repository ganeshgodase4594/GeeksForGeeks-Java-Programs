
/*
 
First Repeating Element
        EasyAccuracy: 32.57%Submissions: 182K+Points: 2
        This Problem will always be here, but this offer won't be back! Save 25% Now

        Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

        Note:- The position you return should be according to 1-based indexing. 

        Example 1:
        Input:
        n = 7
        arr[] = {1, 5, 3, 4, 3, 5, 6}
        Output: 2
        Explanation: 
        5 is appearing twice and 
        its first appearence is at index 2 
        which is less than 3 whose first 
        occuring index is 3.

        Example 2:
        Input:
        n = 4
        arr[] = {1, 2, 3, 4}
        Output: -1
        Explanation: 
        All elements appear only once so 
        answer is -1.

 */



package Array.Easy;

import java.util.*;

public class firstRepeatingElement {

    static int firstRepeated(int[] arr, int n) {
        
        Map<Integer, Integer>hm = new LinkedHashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int x = hm.getOrDefault(arr[i],0);
            hm.put(arr[i],x+1);
        }
        
        // System.out.println(hm);
        int x = -1;
        for(Map.Entry<Integer,Integer>entry : hm.entrySet()){
            if(entry.getValue()>=2){
                x =  entry.getKey();
                break;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i+1;
            }
        }
        
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr, 0));
    }
}
