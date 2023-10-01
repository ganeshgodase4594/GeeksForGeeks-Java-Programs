
/*

Array Subset of another array
        EasyAccuracy: 44.05%Submissions: 240K+Points: 2
        Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

        banner
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

import java.util.ArrayList;

public class ArraySubsetOfAnotherArray {

    static String isSubset( long a1[], long a2[], long n, long m) {
       
       ArrayList<Long>ls = new ArrayList<>();
       
       for(int i=0;i<a1.length;i++){
           ls.add(a1[i]);
       }
       
       for(int i=0;i<a2.length;i++){
           
           if(!ls.contains(a2[i])){
               return "No";
           }
           
           if(ls.contains(a2[i])){
               ls.remove(a2[i]);
           }
           

       }
       
       return "Yes";
    }


    public static void main(String[] args) {
        
        long  a1[] = {1, 2, 3, 4, 4, 5, 6};
        long a2[] = {1, 2, 4};

        System.out.println(isSubset(a1, a2, 0, 0));
    }
}
