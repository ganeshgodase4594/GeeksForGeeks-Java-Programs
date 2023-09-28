
/*

Rearrange an array with O(1) extra space
        MediumAccuracy: 56.34%Submissions: 104K+Points: 4
        Join the most popular course on DSA. Master Skills & Become Employable by enrolling today!

        banner
        Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that the transformed array arrT[i] becomes arr[arr[i]].

        NOTE: arr and arrT are both same variables, representing the array before and after transformation respectively.

        Example 1:
        Input:
        N = 2
        arr[] = {1,0}
        Output: 0 1
        Explanation: 
        arr[arr[0]] = arr[1] = 0
        arr[arr[1]] = arr[0] = 1
        So, arrT becomes {0, 1}.

        Example 2:
        Input:
        N = 5
        arr[] = {4,0,2,1,3}
        Output: 3 4 2 0 1
        Explanation: 
        arr[arr[0]] = arr[4] = 3
        arr[arr[1]] = arr[0] = 4
        arr[arr[2]] = arr[2] = 2
        arr[arr[3]] = arr[1] = 0
        arr[arr[4]] = arr[3] = 1
        and so on
        So, arrT becomes {3, 4, 2, 0, 1}


 */




package Array.Medium;

import java.util.ArrayList;

public class rearrangeArray2 {

    static void arrange(long arr[], int n)
    {
        ArrayList<Long>ls = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            
            ls.add(i,arr[(int)arr[i]]);
        }
        
        int i = 0;
        for(long  data : ls){
            arr[i] = data;
            i++;
        }
    }

    public static void main(String[] args) {
        
        long  arr[] = {4,0,2,1,3};

        arrange(arr, 0);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
