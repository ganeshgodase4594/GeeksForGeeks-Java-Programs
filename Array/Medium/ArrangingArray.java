
/*
 Arranging the array
        MediumAccuracy: 37.41%Submissions: 62K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today!

        banner
        You are given an array of size N. Rearrange the given array in-place such that all the negative numbers occur before all non-negative numbers.
        (Maintain the order of all -ve and non-negative numbers as given in the original array).

        Example 1:
        Input:
        N = 4
        Arr[] = {-3, 3, -2, 2}
        Output:
        -3 -2 3 2
        Explanation:
        In the given array, negative numbers
        are -3, -2 and non-negative numbers are 3, 2.
        
        
        Example 2:
        Input:
        N = 4
        Arr[] = {-3, 1, 0, -2}
        Output:
        -3 -2 1 0
        Explanation:
        In the given array, negative numbers
        are -3, -2 and non-negative numbers are 1, 0.

 */



package Array.Medium;

import java.util.ArrayList;

public class ArrangingArray {

    static void Rearrange(int a[], int n)
    {
        ArrayList<Integer>ls1 = new ArrayList<>();
        ArrayList<Integer>ls2 = new ArrayList<>();
        
        for(int i=0;i<a.length;i++){
            
            if(a[i]<0){
                ls1.add(a[i]);
            }
            else{
                ls2.add(a[i]);
            }
        }
        
        ls1.addAll(ls2);
        
        for(int i=0;i<a.length;i++){
            a[i] = ls1.get(i);
        }
        
        // int ind1 = 0;
        // while(ind1<ls1.size()){
        //     a[ind1] = ls1.get(ind1);
        //     ind1++;
        // }
        
        // int ind2 = 0;
        // int i=ls1.size();
        
        // while(ind2<ls2.size()){
        //     a[i] = ls2.get(ind2);
        //     i++;
        //     ind2++;
        // }
    }
    
    public static void main(String[] args) {
        int  Arr[] = {-3, 3, -2, 2};

        Rearrange(Arr, 0);

        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
    }
}
