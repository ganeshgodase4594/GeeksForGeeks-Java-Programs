

/*

Smaller on Left
        MediumAccuracy: 22.61%Submissions: 32K+Points: 4
        Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

        banner
        Given an array arr[ ] of N positive integers, the task is to find the greatest element on the left of every element in the array which is strictly smaller than itself, if this element does not exist for an index print "-1".

        Example 1:
        Input:
        N = 5
        arr[] = {2, 3, 4, 5, 1}
        Output: 
        -1 2 3 4 -1
        Explanation:
        Greatest element on the left of 3 smaller 
        than itself is 2, for 4 it is 3 and for 5 
        it is 1. Since 2 is the first element and 
        no element on its left is present, so it's 
        greatest smaller element will be -1 and for 
        1 no element smaller than itself is present 
        on its left, so it's greatest smaller element 
        is -1.

        Example 2:
        Input:
        N = 3
        arr[] = {1, 2, 3} 
        Output:
        -1 1 2 .


 */



package Array.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;


public class smallerOnLeft {

    public static int[] Smallestonleft (int arr[], int n) {
            
        ArrayList<Integer>ls = new ArrayList<>();
        
        int ans[] = new int[arr.length];
        ans[0] = -1;
        ls.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            
            Collections.sort(ls);
            int ind = ls.size()-1;
            while(ind>=0){
                
                if(ls.get(ind)<arr[i]){
                    break;
                }
                
                ind--;
            }    
            
            if(ind>=0){
                
                ans[i] = ls.get(ind);
        
            }
            
            else{
                
                ans[i] = -1;
            }

            ls.add(arr[i]);
        }
        
        return ans;
    }

    public static int[] SmallestonleftO (int arr[], int n) {
            
        TreeMap<Integer,Integer>tm = new TreeMap<>();
        
        int ans[] = new int[arr.length];
        ans[0] = -1;

        tm.put(arr[0], 0);
        for(int i=1;i<arr.length;i++){
            
            ArrayList<Integer>ls = new ArrayList<>(tm.descendingKeySet());
            boolean flag = false;
            for(int j=0;j<ls.size();j++){
                if(ls.get(j)<arr[i]){
                    flag = true;
                    ans[i] = ls.get(j);
                    break;
                }
            }
            // int ind = ls.size()-1;
            // while(ind>=0){
                
            //     if(ls.get(ind)<arr[i]){
            //         break;
            //     }
                
            //     ind--;
            // }    
            
            // if(ind>=0){
                
            //     ans[i] = ls.get(ind);
        
            // }
            
            // else{
                
            //     ans[i] = -1;
            // }

            if(!flag){
                ans[i] = -1;
            }

            tm.put(arr[i], i);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 2, 2, 5, 5, 4, 2, 5};

        int ans[] = SmallestonleftO(arr, 0);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
