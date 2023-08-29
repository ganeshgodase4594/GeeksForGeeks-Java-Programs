

/*

Equilibrium Point
        EasyAccuracy: 28.13%Submissions: 460K+Points: 2
        Win from a prize pool of INR 15K and get exciting merch! Register your team for Hack-A-Thon today!

        Given an array A of n positive numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

        Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

        Example 1:
        Input: 
        n = 5 
        A[] = {1,3,5,2,2} 
        Output: 
        3 
        Explanation:  
        equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2). 


        Example 2:
        Input:
        n = 1
        A[] = {1}
        Output: 
        1
        Explanation:
        Since there's only element hence its only the equilibrium point.
 
 */












package Array.Easy;

import java.util.HashMap;

public class EquilibriumPoint {

    static int equilibriumPoint(long arr[], int n) {
    
        HashMap<Long,Long>hm = new HashMap<>();
        int equPoint = -1;
        long sum = 0;

        for(long i=0;i<arr.length;i++){
            hm.put((long)i, sum);
            sum +=arr[(int)i];
        }

        System.out.println(hm);

        // System.out.println(hm.get((long)0));

        long revSum = 0;
        for(long i=arr.length-1;i>=0;i--){

            if(hm.get((long)i)==revSum){
                return (int)i+1;
            }
            revSum +=arr[(int)i];
            System.out.println(revSum);
        }
        return equPoint;
    }


    public static void main(String[] args) {
        
        long A[] = {1,3,5,2,2};

        System.out.println(equilibriumPoint(A, 0));
    }

}