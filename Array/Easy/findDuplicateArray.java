

/*
 Find duplicates in an array
        EasyAccuracy: 18.95%Submissions: 470K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order.

        Note: The extra space is only for the array to be returned.
        Try and perform all operations within the provided array. 

        Example 1:

        Input:
        N = 4
        a[] = {0,3,1,2}
        Output: -1
        Explanation: There is no repeating element in the array.Therefore output is -1.
        Example 2:

        Input:
        N = 5
        a[] = {2,3,1,2,3}
        Output: 2 3 
        Explanation: 2 and 3 occur more than once
        in the given array.
 */

package Array.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class findDuplicateArray {

    static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer>ls = new ArrayList<>();
        Map<Integer,Integer>hm = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            int x = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], x+1);         
        }

        boolean flag = false;
        for(Map.Entry<Integer,Integer>entry : hm.entrySet()){
            if(entry.getValue()>1){
                flag = true;
                ls.add(entry.getKey());
            }
        }

        System.out.println(hm);


        if(!flag){
            ls.add(-1);
        }

        return ls;
    }
    
    public static void main(String[] args) {
        int arr[] = {14 ,7, 14, 6, 1, 11, 3, 16, 16, 8, 7, 4, 11, 15, 17, 6, 1, 13};

        ArrayList<Integer>ls = duplicates(arr, 0);

        System.out.println(ls);
    }
}
