

/*


 Array Subset of another array
        EasyAccuracy: 44.05%Submissions: 221K+Points: 2
        Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

        Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. There can be duplicate elements.
        

        Example 1:
        Input:
        a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
        a2[] = {11, 3, 7, 1, 7}
        Output:
        Yes
        Explanation:
        a2[] is a subset of a1[]


        Example 2:
        Input:
        a1[] = {1, 2, 3, 4, 4, 5, 6}
        a2[] = {1, 2, 4}
        Output:
        Yes
        Explanation:
        a2[] is a subset of a1[]


        Example 3:
        Input:
        a1[] = {10, 5, 2, 23, 19}
        a2[] = {19, 5, 3}
        Output:
        No
        Explanation:
        a2[] is not a subset of a1[]


 */



package Array.Easy;

import java.util.HashMap;

public class ArrayIsSubsetOfArray {
    static String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Integer,Long>mp = new HashMap<>();

        for(int i=0;i<a2.length;i++){
            mp.put(i, a2[i]);
        }

        int count =0;
        for(int i=0;i<a1.length;i++){
            if(mp.containsValue(a1[i])){
                count++;
            }
        }

        if(count<a2.length){
            return "No";
        }

        return "Yes";
        
    }
    public static void main(String[] args) {
        long a1[] = {10, 5, 2, 23, 19};
        long a2[] = {19, 5, 3};

        System.out.println(isSubset(a1, a2, 0, 0));
    }
}
