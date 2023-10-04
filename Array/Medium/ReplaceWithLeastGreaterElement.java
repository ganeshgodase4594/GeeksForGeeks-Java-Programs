

/*

Replace every element with the least greater element on its right
        MediumAccuracy: 61.31%Submissions: 24K+Points: 4
        Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

        banner
        Given an array arr[] of N integers and replace every element with the least greater element on its right side in the array. If there are no greater elements on the right side, replace it with -1. 

        Example 1:
        Input:
        arr[] = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28}
        Output: {18, 63, 80, 25, 32, 43, 80, 93, 80, 25, 93, -1, 28, -1, -1}
        Explanation: 
        The least next greater element of 8 is 18.
        The least next greater element of 58 is 63 and so on.

        Example 2:
        Input:
        arr[] = {2, 6, 9, 1, 3, 2}
        Output: {3, 9, -1, 2, -1, -1}
        Explanation: 
        The least next greater element of 2 is 3. 
        The least next greater element of 6 is 9.
        least next greater element for 9 does not
        exist and so on.


 */


package Array.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class ReplaceWithLeastGreaterElement {

    static ArrayList<Integer> findLeastGreater(int n, int[] arr) {

       TreeSet<Integer>hs = new TreeSet<>();
       LinkedList<Integer>lhs = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
            lhs.add(arr[i]);
        }


        ArrayList<Integer>ls = new ArrayList<>();
        for(int i=0;i<arr.length;i++){

            TreeSet<Integer>ts = new TreeSet<>(getSubset(arr[i], lhs,i));

            if(ts.higher(arr[i])!=null){
                ls.add(ts.higher(arr[i]));
            }

            else{

                ls.add(-1);
            }
        }

        return ls;
        
    }

    static Set<Integer> getSubset(int data,LinkedList<Integer>lhs,int ind){
        
        LinkedHashSet<Integer>st = new LinkedHashSet<>();
        
        for(int i=ind;i<lhs.size();i++){
            st.add(lhs.get(i));
        }
        
        // System.out.println(st);
        return st;
    }


    public static void main(String[] args) {
        
        int  arr[] = {2 ,6, 9, 1, 3, 2};

        ArrayList<Integer>ls = findLeastGreater(0, arr);

        System.out.println(ls);
    }
}
