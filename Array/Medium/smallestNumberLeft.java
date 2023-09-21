
/*
Smallest number on left
        MediumAccuracy: 54.85%Submissions: 50K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
        Given an array a of integers of length n, find the nearest smaller number for every element such that the smaller element is on left side.If no small element present on the left print -1.

        Example 1:
        Input: n = 3
        a = {1, 6, 2}
        Output: -1 1 1
        Explaination: There is no number at the 
        left of 1. Smaller number than 6 and 2 is 1.


        Example 2:
        Input: n = 6
        a = {1, 5, 0, 3, 4, 5}
        Output: -1 1 -1 0 3 4
        Explaination: Upto 3 it is easy to see 
        the smaller numbers. But for 4 the smaller 
        numbers are 1, 0 and 3. But among them 3 
        is closest. Similary for 5 it is 4.
*/



package Array.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class smallestNumberLeft {

    static List<Integer> leftSmaller(int n, int a[])
    {
        
        List<Integer>ls = new ArrayList<>();
        
        Stack<Integer>st = new Stack<>();
        
        for(int i=0;i<a.length;i++){
            
            if(st.isEmpty()){
                ls.add(-1);
                st.push(a[i]);
            }
            
            else if(st.peek() >= a[i] ){
                
                while(st.peek() >= a[i]){
                    st.pop();
                    
                    if(st.isEmpty()){
                        break;
                    }
                }
                
                if(!st.isEmpty()){
                    ls.add(st.peek());
                    
                }
                else{
                    ls.add(-1);
                }
                
                st.push(a[i]);
            }
            else{
                ls.add(st.peek());
                st.push(a[i]);
            }
        }
        
        return ls;
    }

    public static void main(String[] args) {
        int[]   a = {1, 5, 0, 3, 4, 5};

        System.out.println(leftSmaller(0, a));
    }
}
